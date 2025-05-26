package ast.TS;

import ast.ASTNode;

public class Values implements ASTNode {
    private String value;

    public Values(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Value: " + value);
    }

    @Override
    public String toString() {
        return value;
    }
}
