package visitor.css;

import antlr.css.CssParser;
import antlr.css.CssParserBaseVisitor;
import ast.css.CssSelector;

import java.util.ArrayList;
import java.util.List;

public class CssSelectorVisitor extends CssParserBaseVisitor<CssSelector> {

    @Override
    public CssSelector visitQualifiedSelector(CssParser.QualifiedSelectorContext ctx) {
        CssSelector cssSelector = new CssSelector(ctx.getStart().getLine());
        List<String> classes = new ArrayList<>();
        List<String> pseudoClasses = new ArrayList<>();
        List<String> pseudoElements = new ArrayList<>();

        if (ctx.CSS_ID(0) != null) {
            cssSelector.setElementName(ctx.CSS_ID(0).getText());
        }

        int idIdx = 1;
        int dotCount = ctx.CSS_DOT() != null ? ctx.CSS_DOT().size() : 0;
        for (int i = 0; i < dotCount; i++) {
            if (idIdx < ctx.CSS_ID().size() && ctx.CSS_ID(idIdx) != null) {
                classes.add(ctx.CSS_ID(idIdx).getText());
            }
            idIdx++;
        }
        cssSelector.setClasses(classes);

        int colonCount = ctx.CSS_COLON() != null ? ctx.CSS_COLON().size() : 0;
        int pseudoClassEnd = colonCount;
        for (int i = 0; i < colonCount - 1; i++) {
            if (ctx.CSS_COLON(i) != null && ctx.CSS_COLON(i + 1) != null
                    && ":".equals(ctx.CSS_COLON(i).getText()) && ":".equals(ctx.CSS_COLON(i + 1).getText())) {
                pseudoClassEnd = i;
                break;
            }
        }
        for (int i = 0; i < pseudoClassEnd && idIdx < ctx.CSS_ID().size(); i++) {
            if (ctx.CSS_ID(idIdx) != null) {
                pseudoClasses.add(ctx.CSS_ID(idIdx).getText());
            }
            idIdx++;
        }
        for (int i = pseudoClassEnd; i < colonCount - 1 && idIdx < ctx.CSS_ID().size(); i += 2) {
            if (ctx.CSS_ID(idIdx) != null) {
                pseudoElements.add(ctx.CSS_ID(idIdx).getText());
            }
            idIdx++;
        }

        cssSelector.setPseudoClasses(pseudoClasses);
        cssSelector.setPseudoElements(pseudoElements);
        return cssSelector;
    }

    @Override
    public CssSelector visitStandaloneSimpleSelector(CssParser.StandaloneSimpleSelectorContext ctx) {
        CssSelector cssSelector = new CssSelector(ctx.getStart().getLine());
        List<String> classes = new ArrayList<>();
        List<String> pseudoClasses = new ArrayList<>();
        List<String> pseudoElements = new ArrayList<>();

        int dotCount = ctx.CSS_DOT() != null ? ctx.CSS_DOT().size() : 0;
        int idIdx = 0;
        for (int i = 0; i < dotCount; i++) {
            if (idIdx < ctx.CSS_ID().size() && ctx.CSS_ID(idIdx) != null) {
                classes.add(ctx.CSS_ID(idIdx).getText());
            }
            idIdx++;
        }
        cssSelector.setClasses(classes);

        int colonCount = ctx.CSS_COLON() != null ? ctx.CSS_COLON().size() : 0;
        int pseudoClassEnd = colonCount;
        for (int i = 0; i < colonCount - 1; i++) {
            if (ctx.CSS_COLON(i) != null && ctx.CSS_COLON(i + 1) != null
                    && ":".equals(ctx.CSS_COLON(i).getText()) && ":".equals(ctx.CSS_COLON(i + 1).getText())) {
                pseudoClassEnd = i;
                break;
            }
        }
        for (int i = 0; i < pseudoClassEnd && idIdx < ctx.CSS_ID().size(); i++) {
            if (ctx.CSS_ID(idIdx) != null) {
                pseudoClasses.add(ctx.CSS_ID(idIdx).getText());
            }
            idIdx++;
        }
        for (int i = pseudoClassEnd; i < colonCount - 1 && idIdx < ctx.CSS_ID().size(); i += 2) {
            if (ctx.CSS_ID(idIdx) != null) {
                pseudoElements.add(ctx.CSS_ID(idIdx).getText());
            }
            idIdx++;
        }

        cssSelector.setPseudoClasses(pseudoClasses);
        cssSelector.setPseudoElements(pseudoElements);
        return cssSelector;
    }

    @Override
    public CssSelector visitTypeAndIdSelector(CssParser.TypeAndIdSelectorContext ctx) {
        CssSelector cssSelector = new CssSelector(ctx.start.getLine());
        List<String> pseudoClasses = new ArrayList<>();
        List<String> pseudoElements = new ArrayList<>();

        if (ctx.CSS_ID(0) != null) {
            cssSelector.setElementName(ctx.CSS_ID(0).getText());
        }
        int idIdx = 1;

        if (ctx.CSS_HASH() != null && !ctx.CSS_HASH().isEmpty()
                && idIdx < ctx.CSS_ID().size() && ctx.CSS_ID(idIdx) != null) {
            cssSelector.setId(ctx.CSS_ID(idIdx).getText());
            idIdx++;
        }

        int colonCount = ctx.CSS_COLON() != null ? ctx.CSS_COLON().size() : 0;
        int pseudoClassEnd = colonCount;
        for (int i = 0; i < colonCount - 1; i++) {
            if (ctx.CSS_COLON(i) != null && ctx.CSS_COLON(i + 1) != null
                    && ":".equals(ctx.CSS_COLON(i).getText()) && ":".equals(ctx.CSS_COLON(i + 1).getText())) {
                pseudoClassEnd = i;
                break;
            }
        }
        for (int i = 0; i < pseudoClassEnd && idIdx < ctx.CSS_ID().size(); i++) {
            if (ctx.CSS_ID(idIdx) != null) {
                pseudoClasses.add(ctx.CSS_ID(idIdx).getText());
            }
            idIdx++;
        }
        for (int i = pseudoClassEnd; i < colonCount - 1 && idIdx < ctx.CSS_ID().size(); i += 2) {
            if (ctx.CSS_ID(idIdx) != null) {
                pseudoElements.add(ctx.CSS_ID(idIdx).getText());
            }
            idIdx++;
        }

        cssSelector.setPseudoClasses(pseudoClasses);
        cssSelector.setPseudoElements(pseudoElements);
        return cssSelector;
    }

    @Override
    public CssSelector visitTypeSelector(CssParser.TypeSelectorContext ctx) {
        CssSelector cssSelector = new CssSelector(ctx.start.getLine());
        List<String> pseudoClasses = new ArrayList<>();
        List<String> pseudoElements = new ArrayList<>();

        if (ctx.CSS_ID(0) != null) {
            cssSelector.setElementName(ctx.CSS_ID(0).getText());
        }
        int idIdx = 1;

        int colonCount = ctx.CSS_COLON() != null ? ctx.CSS_COLON().size() : 0;
        int pseudoClassEnd = colonCount;
        for (int i = 0; i < colonCount - 1; i++) {
            if (ctx.CSS_COLON(i) != null && ctx.CSS_COLON(i + 1) != null
                    && ":".equals(ctx.CSS_COLON(i).getText()) && ":".equals(ctx.CSS_COLON(i + 1).getText())) {
                pseudoClassEnd = i;
                break;
            }
        }
        for (int i = 0; i < pseudoClassEnd && idIdx < ctx.CSS_ID().size(); i++) {
            if (ctx.CSS_ID(idIdx) != null) {
                pseudoClasses.add(ctx.CSS_ID(idIdx).getText());
            }
            idIdx++;
        }
        for (int i = pseudoClassEnd; i < colonCount - 1 && idIdx < ctx.CSS_ID().size(); i += 2) {
            if (ctx.CSS_ID(idIdx) != null) {
                pseudoElements.add(ctx.CSS_ID(idIdx).getText());
            }
            idIdx++;
        }

        cssSelector.setPseudoClasses(pseudoClasses);
        cssSelector.setPseudoElements(pseudoElements);
        return cssSelector;
    }

    @Override
    public CssSelector visitUniversalSelector(CssParser.UniversalSelectorContext ctx) {
        CssSelector cssSelector = new CssSelector(ctx.start.getLine());
        List<String> pseudoClasses = new ArrayList<>();
        List<String> pseudoElements = new ArrayList<>();

        cssSelector.setElementName("*");

        int colonCount = ctx.CSS_COLON() != null ? ctx.CSS_COLON().size() : 0;
        int idIdx = 0;
        int pseudoClassEnd = colonCount;
        for (int i = 0; i < colonCount - 1; i++) {
            if (ctx.CSS_COLON(i) != null && ctx.CSS_COLON(i + 1) != null
                    && ":".equals(ctx.CSS_COLON(i).getText()) && ":".equals(ctx.CSS_COLON(i + 1).getText())) {
                pseudoClassEnd = i;
                break;
            }
        }
        for (int i = 0; i < pseudoClassEnd && idIdx < ctx.CSS_ID().size(); i++) {
            if (ctx.CSS_ID(idIdx) != null) {
                pseudoClasses.add(ctx.CSS_ID(idIdx).getText());
            }
            idIdx++;
        }
        for (int i = pseudoClassEnd; i < colonCount - 1 && idIdx < ctx.CSS_ID().size(); i += 2) {
            if (ctx.CSS_ID(idIdx) != null) {
                pseudoElements.add(ctx.CSS_ID(idIdx).getText());
            }
            idIdx++;
        }

        cssSelector.setPseudoClasses(pseudoClasses);
        cssSelector.setPseudoElements(pseudoElements);
        return cssSelector;
    }
}