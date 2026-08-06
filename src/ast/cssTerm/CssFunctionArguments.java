package ast.cssTerm;

import ast.ASTNode;

import java.util.List;

public class CssFunctionArguments extends ASTNode {
    public List<CssTerm> cssTerms;
    public List<List<CssTerm>> groupedTerms;

    public CssFunctionArguments(int line_number) {
        super("CssFunctionArguments", line_number);
    }

    public void setCssTerms(List<CssTerm> cssTerms) {
        this.cssTerms = cssTerms;
    }

    public void setGroupedTerms(List<List<CssTerm>> groupedTerms) {
        this.groupedTerms = groupedTerms;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if(cssTerms != null){
            for(CssTerm cssTerm : cssTerms){
                stringBuilder.append(cssTerm)
                        .append(cssTerms.indexOf(cssTerm) == cssTerms.size() - 1 ? "" : ", ");
            }
        }
        return stringBuilder.toString();
    }
}
