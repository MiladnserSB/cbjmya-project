
package ast.TS;

import ast.ASTNode;

public class MethodBody implements ASTNode {
    private String returnTarget; // could be an identifier or literal
    private boolean isThisReference;

    public MethodBody(String returnTarget, boolean isThisReference) {
        this.returnTarget = returnTarget;
        this.isThisReference = isThisReference;
    }

    public String getReturnTarget() {
        return returnTarget;
    }

    public boolean isThisReference() {
        return isThisReference;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "MethodBody:");
        System.out.println(indent + "  Return: " +
                (isThisReference ? "this." : "") + returnTarget);
    }

    @Override
    public String toString() {
        return "return " + (isThisReference ? "this." : "") + returnTarget + ";";
    }
}
