package ast.HTML;

import ast.ASTNode;

public class TextContent implements ASTNode {
    private final String text;

    public TextContent(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    @Override
    public void prettyPrint(String indent) {
       System.out.println(indent + "Text: " + text);
    }
}