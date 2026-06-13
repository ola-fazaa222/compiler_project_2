package app;

import antlr.css.CssLexer;
import antlr.css.CssParser;
import antlr.html.HtmlLexer;
import antlr.html.HtmlParser;
import antlr.python.PythonLexer;
import antlr.python.PythonParser;
import ast.ASTNode;
import ast.HtmlContent;
import ast.Program;
import listener.CustomErrorListener;
import semantic.CssSemanticAnalyzer;
import semantic.HtmlSemanticAnalyzer;
import semantic.JinjaSymbolCollector;
import semantic.JinjaTemplateVariableDetector;
import semantic.SemanticAnalyzer;
import semantic.SemanticError;
import semantic.TemplateVariableChecker;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import symbolTable.SymbolTableManager;
import visitor.css.StyleSheetVisitor;
import visitor.html.HtmlContentVisitor;
import visitor.python.ProgramVisitor;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        Path outputDir = Paths.get("output");
        try {
            Files.createDirectories(outputDir);
        } catch (IOException e) {
            System.err.println("Could not create output directory: " + e.getMessage());
        }

        if (args.length != 1) {
            System.err.println("Usage: java app.App <directory_path_or_file>");
            return;
        }

        Path startPath = Paths.get(args[0]);

        System.out.println("PATH = " + startPath.toAbsolutePath());
        System.out.println("EXISTS = " + Files.exists(startPath));

        if (!Files.exists(startPath)) {
            System.err.println("Path does not exist!");
            return;
        }

        try {

            if (Files.isDirectory(startPath)) {

                // Pass 1: Collect render_template info from Python files
                try (Stream<Path> paths = Files.walk(startPath)) {
                    paths.filter(Files::isRegularFile)
                            .filter(p -> p.toString().endsWith(".py"))
                            .forEach(path -> collectTemplateVars(path.toString()));
                }

                // Pass 2: Process all files
                try (Stream<Path> paths = Files.walk(startPath)) {
                    paths.filter(Files::isRegularFile)
                            .forEach(path -> {
                                String fileName = path.toString();
                                System.out.println("\n--- Processing: " + fileName + " ---");
                                processFile(fileName);
                            });
                }

            }

            else {

                // Single file mode
                if (startPath.toString().endsWith(".py")) {
                    collectTemplateVars(startPath.toString());
                }

                System.out.println("\n--- Processing: " + startPath + " ---");
                processFile(startPath.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processFile(String fileName) {
        PrintStream originalOut = System.out;
        String baseName = deriveBaseName(fileName);
        Path sourcePath = Paths.get(baseName);
        String pureFileName = sourcePath.getFileName().toString();
        try {

            // ================= PYTHON =================
            if (fileName.endsWith(".py")) {

                PythonLexer lexer =
                        new PythonLexer(CharStreams.fromFileName(fileName));

                CommonTokenStream tokens =
                        new CommonTokenStream(lexer);

                PythonParser parser =
                        new PythonParser(tokens);

                CustomErrorListener errorListener = new CustomErrorListener();
                parser.removeErrorListeners();
                parser.addErrorListener(errorListener);

                ParseTree tree = parser.prog();

                ProgramVisitor visitor = new ProgramVisitor();
                Program program = visitor.visit(tree);

                // Write AST to file
                try (PrintStream ps = new PrintStream("output/" + pureFileName + "_ast.txt")) {
                    System.setOut(ps);
                      System.out.println(program);
                }

                // Write symbol table to file
                try (PrintStream ps = new PrintStream("output/" + pureFileName + "_symbol_table.txt")) {
                    System.setOut(ps);
                    SymbolTableManager.INSTANCE.printFullTable();
                }

                // Write errors to file (syntax + semantic)
                try (PrintStream ps = new PrintStream("output/" + pureFileName + "_errors.txt")) {
                    System.setOut(ps);
                    writeSyntaxErrors(errorListener);
                    SemanticAnalyzer analyzer = new SemanticAnalyzer();
                    analyzer.analyze(program, fileName);
                }

                System.setOut(originalOut);
                if (errorListener.hasErrors()) {
                    System.out.println("[SYNTAX ERRORS] " + pureFileName + " -> output/");
                } else {
                    System.out.println("[OK] " + pureFileName + " -> output/");
                }
            }

            // ================= HTML / J2 =================
            else if (fileName.endsWith(".html")
                    || fileName.endsWith(".j2")) {

                HtmlLexer lexer =
                        new HtmlLexer(CharStreams.fromFileName(fileName));

                CommonTokenStream tokens =
                        new CommonTokenStream(lexer);

                HtmlParser parser =
                        new HtmlParser(tokens);

                CustomErrorListener errorListener = new CustomErrorListener();
                parser.removeErrorListeners();
                parser.addErrorListener(errorListener);

                ParseTree tree = parser.html_content();

                HtmlContentVisitor visitor =
                        new HtmlContentVisitor();

                HtmlContent htmlContent = visitor.visit(tree);

                try (PrintStream ps = new PrintStream("output/" + pureFileName + "_ast.txt")) {
                    System.setOut(ps);
                    System.out.println(htmlContent);
                }

                // Write Jinja symbol table to file
                JinjaSymbolCollector jinjaCollector = new JinjaSymbolCollector();
                jinjaCollector.analyze(htmlContent);
                try (PrintStream ps = new PrintStream("output/" + pureFileName + "_symbol_table.txt")) {
                    System.setOut(ps);
                    jinjaCollector.printTable();
                }

                JinjaTemplateVariableDetector jinjaVarDetector = new JinjaTemplateVariableDetector();
                jinjaVarDetector.analyze(jinjaCollector, fileName);
                try (PrintStream ps = new PrintStream("output/" + pureFileName + "_errors.txt")) {
                    System.setOut(ps);
                    writeSyntaxErrors(errorListener);
                    HtmlSemanticAnalyzer htmlAnalyzer = new HtmlSemanticAnalyzer();
                    htmlAnalyzer.analyze(htmlContent);
                    jinjaVarDetector.printErrors();
                }

                System.setOut(originalOut);
                if (errorListener.hasErrors()) {
                    System.out.println("[SYNTAX ERRORS] " + pureFileName + " -> output/");
                } else {
                    System.out.println("[OK] " + pureFileName + " -> output/");
                }
            }

            // ================= CSS =================
            else if (fileName.endsWith(".css")) {

                CssLexer lexer =
                        new CssLexer(CharStreams.fromFileName(fileName));

                CommonTokenStream tokens =
                        new CommonTokenStream(lexer);

                CssParser parser =
                        new CssParser(tokens);

                CustomErrorListener errorListener = new CustomErrorListener();
                parser.removeErrorListeners();
                parser.addErrorListener(errorListener);

                ParseTree tree = parser.style_sheet();

                StyleSheetVisitor visitor =
                        new StyleSheetVisitor();

                ASTNode styleSheet = visitor.visit(tree);

                try (PrintStream ps = new PrintStream("output/" + pureFileName + "_ast.txt")) {
                    System.setOut(ps);
                    System.out.println(styleSheet);
                }

                try (PrintStream ps = new PrintStream("output/" + pureFileName + "_errors.txt")) {
                    System.setOut(ps);
                    writeSyntaxErrors(errorListener);
                    CssSemanticAnalyzer cssAnalyzer = new CssSemanticAnalyzer();
                    if (styleSheet instanceof ast.htmlElement.StyleSheet ss) {
                        cssAnalyzer.analyze(ss);
                    }
                }

                System.setOut(originalOut);
                if (errorListener.hasErrors()) {
                    System.out.println("[SYNTAX ERRORS] " + pureFileName + " -> output/");
                } else {
                    System.out.println("[OK] " + pureFileName + " -> output/");
                }
            }

        } catch (Exception e) {

            System.setOut(originalOut);
            System.err.println(
                    "Error parsing " + fileName + ": " + e.getMessage()
            );

            e.printStackTrace();
        }
    }

    private static void collectTemplateVars(String fileName) {
        try {
            PythonLexer lexer = new PythonLexer(CharStreams.fromFileName(fileName));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PythonParser parser = new PythonParser(tokens);
            parser.removeErrorListeners();
            ParseTree tree = parser.prog();
            ProgramVisitor visitor = new ProgramVisitor();
            Program program = visitor.visit(tree);
            TemplateVariableChecker.collectRenderTemplate(program, fileName);
        } catch (Exception e) {
            // ignore — will be caught again in processFile
        }
    }

    private static void writeSyntaxErrors(CustomErrorListener errorListener) {
        if (errorListener.hasErrors()) {
            System.out.println("========== SYNTAX ERRORS (" + errorListener.getSyntaxErrors().size() + ") ==========");
            int i = 1;
            for (SemanticError e : errorListener.getSyntaxErrors()) {
                System.out.println("  " + i + ". " + e);
                i++;
            }
            System.out.println("===============================================================");
        }
    }

    private static String deriveBaseName(String filePath) {
        String name = filePath.replace("\\", "/");
        if (name.contains("/")) {
            name = name.substring(name.lastIndexOf('/') + 1);
        }
        if (name.contains(".")) {
            name = name.substring(0, name.lastIndexOf('.'));
        }
        return name;
    }

    private static void showParseTree(
            String[] ruleNames,
            ParseTree parseTree
    ) {

        TreeViewer viewer = new TreeViewer(
                java.util.Arrays.asList(ruleNames),
                parseTree
        );

        viewer.setScale(1.5);

        JPanel mainPanel = new JPanel(new BorderLayout());

        mainPanel.add(viewer, BorderLayout.CENTER);

        JScrollPane scrollPane = new JScrollPane(mainPanel);

        scrollPane.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
        );

        scrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
        );

        JPanel controlPanel = new JPanel();

        JButton zoomInButton = new JButton("Zoom In");

        JButton zoomOutButton = new JButton("Zoom Out");

        JButton resetButton = new JButton("Reset Zoom");

        zoomInButton.addActionListener(e -> {

            viewer.setScale(viewer.getScale() * 1.2);

            viewer.repaint();
        });

        zoomOutButton.addActionListener(e -> {

            viewer.setScale(viewer.getScale() / 1.2);

            viewer.repaint();
        });

        resetButton.addActionListener(e -> {

            viewer.setScale(1.0);

            viewer.repaint();
        });

        controlPanel.add(zoomInButton);

        controlPanel.add(zoomOutButton);

        controlPanel.add(resetButton);

        JFrame frame = new JFrame("Parse Tree Viewer");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(scrollPane, BorderLayout.CENTER);

        frame.add(controlPanel, BorderLayout.SOUTH);

        frame.setSize(1000, 640);

        frame.setVisible(true);
    }

    private static void debugTokenStream(
            CommonTokenStream tokens,
            Lexer lexer
    ) {

        tokens.fill();

        List<Token> allTokens = tokens.getTokens();

        System.out.println("\n--- LEXER TOKEN DEBUG OUTPUT ---");

        for (Token t : allTokens) {

            if (t.getChannel() == Token.DEFAULT_CHANNEL) {

                String tokenName =
                        PythonLexer.VOCABULARY.getSymbolicName(t.getType());

                String tokenText =
                        t.getText()
                                .replace("\n", "\\n")
                                .replace("\r", "\\r");

                if (tokenName == null) {
                    tokenName = "VirtualType(" + t.getType() + ")";
                }

                System.out.printf(
                        "Line %d | %-20s | Text: '%s'\n",
                        t.getLine(),
                        tokenName,
                        tokenText
                );
            }
        }

        System.out.println("--------------------------------\n");
    }
}