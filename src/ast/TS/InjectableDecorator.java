package ast.TS;

import ast.ASTNode;

public class InjectableDecorator implements ASTNode {
    private ProvidedIn providedIn;

    public InjectableDecorator(ProvidedIn providedIn) {
        this.providedIn = providedIn;
    }

    public ProvidedIn getProvidedIn() {
        return providedIn;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "@Injectable Decorator:");
        if (providedIn != null) {
            providedIn.prettyPrint(indent + "  ");
        } else {
            System.out.println(indent + "  (No providedIn)");
        }
    }

    @Override
    public String toString() {
        return "@Injectable(" + (providedIn != null ? providedIn.toString() : "") + ")";
    }
}
