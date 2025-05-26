package ast.TS;

import ast.ASTNode;

public class NgOnInitMethodStatement implements ASTNode {
    private String accessModifier; // Can be null
    private MethodVoidBody body;

    public NgOnInitMethodStatement(String accessModifier, MethodVoidBody body) {
        this.accessModifier = accessModifier;
        this.body = body;
    }

    public String getAccessModifier() {
        return accessModifier;
    }

    public MethodVoidBody getBody() {
        return body;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ngOnInit Method:");
        if (accessModifier != null) {
            System.out.println(indent + "  Access: " + accessModifier);
        }
        body.prettyPrint(indent + "  ");
    }

    @Override
    public String toString() {
        return (accessModifier != null ? accessModifier + " " : "") +
                "ngOnInit(): void {\n  " + body.toString() + "\n}";
    }
}