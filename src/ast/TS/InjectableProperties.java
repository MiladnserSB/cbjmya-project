package ast.TS;

import ast.ASTNode;

public class InjectableProperties implements ASTNode {
    private String providedIn;

    public InjectableProperties(String providedIn) {
        this.providedIn = providedIn;
    }

    public void setProvidedIn(String providedIn) {
        this.providedIn = providedIn;
    }

    public String getProvidedIn() {
        return providedIn;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Injectable Properties:");
        System.out.println(indent + "  providedIn: " + providedIn);
    }
}