package visitor.html;

import antlr.html.HtmlParser;
import antlr.html.HtmlParserBaseVisitor;
import ast.css.CssSelector;

import java.util.ArrayList;
import java.util.List;

public class HtmlCssSelectorVisitor extends HtmlParserBaseVisitor<CssSelector> {
    @Override
    public CssSelector visitQualifiedSelector(HtmlParser.QualifiedSelectorContext ctx) {
        CssSelector cssSelector = new CssSelector(ctx.getStart().getLine());
        List<String> classes = new ArrayList<>();
        cssSelector.setElementName(ctx.CSS_ID(0).getText());
        for (int i = 1; i < ctx.CSS_ID().size(); i++) {
            classes.add(ctx.CSS_ID(i).getText());
        }
        cssSelector.setClasses(classes);
        return cssSelector;
    }

    @Override
    public CssSelector visitStandaloneSimpleSelector(HtmlParser.StandaloneSimpleSelectorContext ctx) {
        CssSelector cssSelector = new CssSelector(ctx.getStart().getLine());
        List<String> classes = new ArrayList<>();
        for (int i = 0; i < ctx.CSS_ID().size(); i++) {
            classes.add(ctx.CSS_ID(i).getText());
        }
        cssSelector.setClasses(classes);
        return cssSelector;
    }

    @Override
    public CssSelector visitTypeAndIdSelector(HtmlParser.TypeAndIdSelectorContext ctx) {
        CssSelector cssSelector = new CssSelector(ctx.start.getLine());
        cssSelector.setElementName(ctx.CSS_ID(0).getText());
        if (ctx.CSS_HASH() != null && !ctx.CSS_HASH().isEmpty()) {
            cssSelector.setId(ctx.CSS_ID(1).getText());
        }
        return cssSelector;
    }

    @Override
    public CssSelector visitTypeSelector(HtmlParser.TypeSelectorContext ctx) {
        CssSelector cssSelector = new CssSelector(ctx.start.getLine());
        cssSelector.setElementName(ctx.CSS_ID(0).getText());
        return cssSelector;
    }

    @Override
    public CssSelector visitUniversalSelector(HtmlParser.UniversalSelectorContext ctx) {
        CssSelector cssSelector = new CssSelector(ctx.start.getLine());
        cssSelector.setElementName("*");
        return cssSelector;
    }
}
