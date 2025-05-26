package ast.HTML;

import ast.ASTNode;
import java.util.List;

public class HtmlContent implements ASTNode {
    private final List<HtmlContentStatement> contentStatements;
    private final String rawContent;

    public HtmlContent(List<HtmlContentStatement> contentStatements) {
        this(contentStatements, null);
    }

    public HtmlContent(List<HtmlContentStatement> contentStatements, String rawContent) {
        this.contentStatements = contentStatements;
        this.rawContent = rawContent;
    }

    public List<HtmlContentStatement> getContentStatements() {
        return contentStatements;
    }

    // ✅ Alias method to fix getContentElements() usage in visitNormalTag
    public List<HtmlContentStatement> getContentElements() {
        return contentStatements;
    }

    public String getRawContent() {
        return rawContent;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "HTML Content:");
        if (contentStatements != null) {
            for (HtmlContentStatement stmt : contentStatements) {
                if (stmt != null) stmt.prettyPrint(indent + "  ");
                else System.out.println(indent + "  [Null Statement]");
            }
        }
        if (rawContent != null && !rawContent.isEmpty()) {
            System.out.println(indent + "  Raw Content: \"" + rawContent + "\"");
        }
    }
}
