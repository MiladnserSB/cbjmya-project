package ast.TS;

import ast.ASTNode;

import java.util.List;

public class Imports implements ASTNode {
    private List<String> identifiers;

    public Imports(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Imports: " + String.join(", ", identifiers));
    }

    @Override
    public String toString() {
        return "Imports=[" + String.join(", ", identifiers) + "]";
    }
}

