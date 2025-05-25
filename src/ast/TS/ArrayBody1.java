package ast.TS;

import ast.ASTNode;

public class ArrayBody1 implements ASTNode {
    private ASTNode value;

    public ArrayBody1(ASTNode value) {
        this.value = value;
    }

    public ASTNode getValue() {
        return value;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Array Element:");
        if (value != null) {
            value.prettyPrint(indent + "  ");
        } else {
            System.out.println(indent + "  null");
        }
    }

    @Override
    public String toString() {
        return value != null ? value.toString() : "null";
    }
}
