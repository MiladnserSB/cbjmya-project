package ast.TS;

import ast.ASTNode;
import java.util.List;

public class ArrayExprTwoStatement implements ASTNode {
    private Signature signature;
    private String type;
    private List<ASTNode> arrayElements;

    public ArrayExprTwoStatement(Signature signature, String type, List<ASTNode> arrayElements) {
        this.signature = signature;
        this.type = type;
        this.arrayElements = arrayElements;
    }

    public Signature getSignature() {
        return signature;
    }

    public String getType() {
        return type;
    }

    public List<ASTNode> getArrayElements() {
        return arrayElements;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ArrayExpression2:");
        signature.prettyPrint(indent + "  ");
        System.out.println(indent + "  Type: " + type + "[]");
        if(arrayElements.isEmpty()) {
            System.out.println(indent + "  Elements: null");
        }else{
            System.out.println(indent + "  Elements:");
            for (ASTNode node : arrayElements) {
                node.prettyPrint(indent + "    ");
            }
        }
    }

    @Override
    public String toString() {
        return signature + ": " + type + "[] = " + arrayElements;
    }
}
