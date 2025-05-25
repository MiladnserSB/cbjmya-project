package ast.TS;

import ast.ASTNode;

public class TypedMethodDeclarationStatement implements ASTNode {
    private Signature signature;
    private Parameters parameters; // can be null
    private MethodBody methodBody;

    public TypedMethodDeclarationStatement(Signature signature, Parameters parameters, MethodBody methodBody) {
        this.signature = signature;
        this.parameters = parameters;
        this.methodBody = methodBody;
    }

    public Signature getSignature() {
        return signature;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public MethodBody getMethodBody() {
        return methodBody;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Method Declaration:");
        signature.prettyPrint(indent + "  ");
        if (parameters != null) {
            parameters.prettyPrint(indent + "  ");
        } else {
            System.out.println(indent + "  Parameters: (none)");
        }
        methodBody.prettyPrint(indent + "  ");
    }

    @Override
    public String toString() {
        return "Method(" + signature.toString() + ", Params: " +
                (parameters != null ? parameters.toString() : "none") + ")";
    }
}
