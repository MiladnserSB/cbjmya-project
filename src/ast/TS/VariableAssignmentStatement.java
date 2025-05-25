package ast.TS;

import ast.ASTNode;

public class VariableAssignmentStatement implements ASTNode {
    private String identifier;
    private String value;

    public VariableAssignmentStatement(String identifier, String value) {
        this.identifier = identifier;
        this.value = value;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Variable Assignment:");
        System.out.println(indent + "  Identifier: " + identifier);
        System.out.println(indent + "  Value: " + value);
    }

    @Override
    public String toString() {
        return identifier + " = " + value;
    }
}
