package ast.HTML;

import ast.ASTNode;

public class HtmlCharData implements ASTNode {
    private final String content;
    private final boolean isWhitespace;

    public HtmlCharData(String content, boolean isWhitespace) {
        this.content = content;
        this.isWhitespace = isWhitespace;
    }

    public String getContent() {
        return content;
    }

    public boolean isWhitespace() {
        return isWhitespace;
    }

    @Override
    public void prettyPrint(String indent) {
        if (isWhitespace) {
            System.out.println(indent + "HTML Character Data (Whitespace)");
        } else {
            System.out.println(indent + "HTML Character Data: " + content);
        }
    }
}
