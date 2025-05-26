package ast.TS;

import ast.ASTNode;

public class MethodCall implements ASTNode {
    private String methodName;
    private String argument; // optional

    public MethodCall(String methodName, String argument) {
        this.methodName = methodName;
        this.argument = argument;
    }

    public String getMethodName() {
        return methodName;
    }

    public String getArgument() {
        return argument;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "MethodCall:");
        System.out.println(indent + "  Method: " + methodName);
        if (argument != null) {
            System.out.println(indent + "  Argument: " + argument);
        }
    }

    @Override
    public String toString() {
        return methodName + "(" + (argument != null ? argument : "") + ")";
    }
}