package ast.TS;

import ast.ASTNode;

public class VoidMethodDeclarationStatement implements ASTNode {
    private Signature signature;
    private Parameters parameters; // Can be null
    private MethodVoidBody body;

    public VoidMethodDeclarationStatement(Signature signature, Parameters parameters, MethodVoidBody body) {
        this.signature = signature;
        this.parameters = parameters;
        this.body = body;
    }

    public Signature getSignature() {
        return signature;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public MethodVoidBody getBody() {
        return body;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Method (void):");
        signature.prettyPrint(indent + "  ");
        if (parameters != null)
            parameters.prettyPrint(indent + "  ");
        body.prettyPrint(indent + "  ");
    }

    @Override
    public String toString() {
        return signature.toString() + "(" +
                (parameters != null ? parameters.toString() : "") +
                "): void {\n" +
                "  " + body.toString() + "\n}";
    }
}
