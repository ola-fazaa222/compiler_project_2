package visitor.jinja;

import antlr.html.HtmlParser;
import antlr.html.HtmlParserBaseVisitor;
import ast.atom.Atom;
import ast.jinja.JinjaArgumentsList;
import ast.jinja.jinjaCallExpr.JinjaAtom;
import ast.jinja.jinjaCallExpr.JinjaCallExpression;
import ast.jinja.jinjaCallExpr.JinjaFilteredExpression;
import ast.jinja.jinjaCallExpr.JinjaFunctionCall;
import ast.jinja.jinjaCallExpr.JinjaVariableAccess;

public class JinjaCallExpressionVisitor extends HtmlParserBaseVisitor<JinjaCallExpression> {
    JinjaVisitor jinjaVisitor = new JinjaVisitor();

    @Override
    public JinjaCallExpression visitJinjaFilteredExpr(HtmlParser.JinjaFilteredExprContext ctx) {
        JinjaFilteredExpression jinjaFilteredExpression = new JinjaFilteredExpression(ctx.start.getLine());
        JinjaCallExpression left = visit(ctx.j_call_expr(0));
        JinjaCallExpression right = visit(ctx.j_call_expr(1));
        jinjaFilteredExpression.setJinjaVariableAccess(
            left instanceof JinjaVariableAccess ? (JinjaVariableAccess) left : null
        );
        if (right instanceof JinjaVariableAccess) {
            jinjaFilteredExpression.setFilterName(((JinjaVariableAccess) right).dottedName);
        } else if (right instanceof JinjaFunctionCall) {
            jinjaFilteredExpression.setFilterName(((JinjaFunctionCall) right).functionName);
        }
        return jinjaFilteredExpression;
    }

    @Override
    public JinjaCallExpression visitJinjaMethodCall(HtmlParser.JinjaMethodCallContext ctx) {
        JinjaVariableAccess varAccess = (JinjaVariableAccess) jinjaVisitor.visit(ctx.j_var_access());
        JinjaFunctionCall jinjaFunctionCall = new JinjaFunctionCall(ctx.start.getLine());
        jinjaFunctionCall.setFunctionName(varAccess.dottedName);
        if (ctx.j_argument_list() != null) {
            JinjaArgumentsList jinjaArgumentsList = (JinjaArgumentsList) jinjaVisitor.visit(ctx.j_argument_list());
            jinjaFunctionCall.setArgumentsList(jinjaArgumentsList);
        }
        return jinjaFunctionCall;
    }

    @Override
    public JinjaCallExpression visitJinjaFunctionCall(HtmlParser.JinjaFunctionCallContext ctx) {
        JinjaFunctionCall jinjaFunctionCall = new JinjaFunctionCall(ctx.start.getLine());
        jinjaFunctionCall.setFunctionName(ctx.J_NAME().getText());
        if (ctx.j_argument_list() != null) {
            JinjaArgumentsList jinjaArgumentsList = (JinjaArgumentsList) jinjaVisitor.visit(ctx.j_argument_list());
            jinjaFunctionCall.setArgumentsList(jinjaArgumentsList);
        }
        return jinjaFunctionCall;
    }

    @Override
    public JinjaCallExpression visitJinjaVarAccessOnly(HtmlParser.JinjaVarAccessOnlyContext ctx) {
        return (JinjaCallExpression) jinjaVisitor.visit(ctx.j_var_access());
    }



    @Override
    public JinjaCallExpression visitJinjaAtomOnly(HtmlParser.JinjaAtomOnlyContext ctx) {
        JinjaAtomVisitor jinjaAtomVisitor = new JinjaAtomVisitor();
        Atom atom = jinjaAtomVisitor.visit(ctx.j_atom());
        return new JinjaAtom(ctx.start.getLine(), atom);
    }
}
