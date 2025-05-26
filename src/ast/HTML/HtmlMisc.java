package ast.HTML;

import ast.ASTNode;

public class HtmlMisc implements ASTNode {
    private final ASTNode content; // Can be HtmlComment or Whitespace

    public HtmlMisc(ASTNode content) {
        this.content = content;
    }

    public ASTNode getContent() {
        return content;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "HtmlMisc:");
        if (content != null) {
            content.prettyPrint(indent + "  ");
        } else {
            System.out.println(indent + "  [Empty]");
        }
    }
}
