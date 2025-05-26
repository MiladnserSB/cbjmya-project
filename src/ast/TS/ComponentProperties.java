package ast.TS;

import ast.ASTNode;

public class ComponentProperties implements ASTNode {
    private Selector selector;
    private Imports imports;
    private TemplateUrl templateUrl;
    private StyleUrl styleUrl;

    public ComponentProperties(Selector selector, Imports imports, TemplateUrl templateUrl, StyleUrl styleUrl) {
        this.selector = selector;
        this.imports = imports;
        this.templateUrl = templateUrl;
        this.styleUrl = styleUrl;
    }

    public Selector getSelector() {
        return selector;
    }

    public Imports getImports() {
        return imports;
    }

    public TemplateUrl getTemplateUrl() {
        return templateUrl;
    }

    public StyleUrl getStyleUrl() {
        return styleUrl;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Component Properties:");
        if (selector != null) selector.prettyPrint(indent + "  ");
        if (imports != null) imports.prettyPrint(indent + "  ");
        if (templateUrl != null) templateUrl.prettyPrint(indent + "  ");
        if (styleUrl != null) styleUrl.prettyPrint(indent + "  ");
    }

    @Override
    public String toString() {
        return "{ " +
                (selector != null ? selector.toString() + ", " : "") +
                (imports != null ? imports.toString() + ", " : "") +
                (templateUrl != null ? templateUrl.toString() + ", " : "") +
                (styleUrl != null ? styleUrl.toString() : "") +
                " }";
    }
}
