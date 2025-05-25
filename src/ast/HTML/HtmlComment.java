package ast.HTML;

import ast.ASTNode;

public class HtmlComment implements ASTNode {
    private final String commentText;
    private final boolean isConditional;

    public HtmlComment(String commentText, boolean isConditional) {
        this.commentText = commentText;
        this.isConditional = isConditional;
    }

    public String getCommentText() {
        return commentText;
    }

    public boolean isConditional() {
        return isConditional;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + (isConditional ? "Conditional Comment:" : "HTML Comment:"));
        System.out.println(indent + "  " + commentText);
    }
}
