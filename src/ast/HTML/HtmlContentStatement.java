package ast.HTML;

import ast.ASTNode;

public class HtmlContentStatement implements ASTNode {
    private ASTNode statement;

    public HtmlContentStatement(ASTNode statement) {
        this.statement = statement;
    }

    public ASTNode getStatement() {
        return statement;
    }

    @Override
    public void prettyPrint(String indent) {

        if (statement != null) {
            statement.prettyPrint(indent + "  ");
        }
    }
    @Override
    public String toString() {
        return "HtmlContentStatement: " + (statement != null ? statement.toString() : "null");
    }
}
