package ast.TS;

import ast.ASTNode;
import java.util.List;

public class ArrayExprOneStatement implements ASTNode {
    private Signature signature;
    private List<ASTNode> elements;

    public ArrayExprOneStatement(Signature signature, List<ASTNode> elements) {
        this.signature = signature;
        this.elements = elements;
    }

    public Signature getSignature() {
        return signature;
    }

    public List<ASTNode> getElements() {
        return elements;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ArrayExpression1:");
        signature.prettyPrint(indent + "  ");
        if(elements.isEmpty()){
        System.out.println(indent + "  Elements: null");
        for (ASTNode el : elements) {
            el.prettyPrint(indent + "    ");
        }
        }else{
            System.out.println(indent + "  Elements:");
            for (ASTNode el : elements) {
                el.prettyPrint(indent + "    ");
            }
        }
    }

    @Override
    public String toString() {
        return signature + " = [" + elements + "]";
    }
}
