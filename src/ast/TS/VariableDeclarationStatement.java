package ast.TS;

import ast.ASTNode;

public class VariableDeclarationStatement implements ASTNode {
    private String signature;
    private String type;
    private String value;

    public VariableDeclarationStatement(String signature, String type, String value) {
        this.signature = signature;
        this.type = type;
        this.value = value;
    }

    public String getSignature() {
        return signature;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Variable Declaration:");
        System.out.println(indent + "  Signature: " + signature);
        System.out.println(indent + "  Type: " + type);
        System.out.println(indent + "  Value: " + value);
    }

    @Override
    public String toString() {
        return signature + ": " + type + " = " + value;
    }
}
