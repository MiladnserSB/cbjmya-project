package ast.TS;

import ast.ASTNode;

public class ClassBodyStatement implements ASTNode {
    private ASTNode statement;

    public ClassBodyStatement(ASTNode statement) {
        this.statement = statement;
    }

    public ASTNode getStatement() {
        return statement;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Class Body Statement:");
        if (statement != null) {
            statement.prettyPrint(indent + "  ");
        }
    }

    @Override
    public String toString() {
        return "ClassBodyStatement: " + (statement != null ? statement.toString() : "null");
    }
}
