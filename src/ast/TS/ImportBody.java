package ast.TS;

import ast.ASTNode;

public class ImportBody implements ASTNode {
    private String name;

    public ImportBody(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Import Body Item: " + name);
    }

    @Override
    public String toString() {
        return name;
    }
}
