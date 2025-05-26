package ast.TS;

import ast.ASTNode;

public class MethodVoidBody implements ASTNode {
    private boolean leftThis;
    private String leftIdentifier;
    private boolean rightThis;
    private String rightIdentifier;
    private String methodCall; // Optional

    public MethodVoidBody(boolean leftThis, String leftIdentifier, boolean rightThis, String rightIdentifier, String methodCall) {
        this.leftThis = leftThis;
        this.leftIdentifier = leftIdentifier;
        this.rightThis = rightThis;
        this.rightIdentifier = rightIdentifier;
        this.methodCall = methodCall;
    }

    public boolean isLeftThis() {
        return leftThis;
    }

    public String getLeftIdentifier() {
        return leftIdentifier;
    }

    public boolean isRightThis() {
        return rightThis;
    }

    public String getRightIdentifier() {
        return rightIdentifier;
    }

    public String getMethodCall() {
        return methodCall;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Void Method Body Assignment:");
        System.out.println(indent + "  Left: " + (leftThis ? "this." : "") + leftIdentifier);
        System.out.println(indent + "  Right: " + (rightThis ? "this." : "") + rightIdentifier +
                (methodCall != null ? "." + methodCall : ""));
    }

    @Override
    public String toString() {
        return (leftThis ? "this." : "") + leftIdentifier + " = " +
                (rightThis ? "this." : "") + rightIdentifier +
                (methodCall != null ? "." + methodCall  : "");
    }
}
