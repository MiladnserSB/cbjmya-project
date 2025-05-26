package ast.TS;

import ast.ASTNode;

public class Signature implements ASTNode {
    private String accessModifier;
    private String staticModifier;
    private String name;

    public Signature(String accessModifier, String staticModifier, String name) {
        this.accessModifier = accessModifier;
        this.staticModifier = staticModifier;
        this.name = name;
    }

    public String getAccessModifier() {
        return accessModifier;
    }

    public String getStaticModifier() {
        return staticModifier;
    }

    public String getName() {
        return name;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Signature:");
        if (accessModifier != null) System.out.println(indent + "  Access: " + accessModifier);
        if (staticModifier != null) System.out.println(indent + "  Static: " + staticModifier);
        System.out.println(indent + "  Name: " + name);
    }

    @Override
    public String toString() {
        return (accessModifier != null ? accessModifier + " " : "") +
                (staticModifier != null ? staticModifier + " " : "") +
                name;
    }
}
