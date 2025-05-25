package ast.HTML;

import ast.ASTNode;
import java.util.List;

public class NormalTag implements HtmlElement {
    private String tagName;
    private List<ASTNode> attributes;
    private List<ASTNode> content;

    public NormalTag(String tagName, List<ASTNode> attributes, List<ASTNode> content) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.content = content;
    }

    public String getTagName() { return tagName; }
    public List<ASTNode> getAttributes() { return attributes; }
    public List<ASTNode> getContent() { return content; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Normal Tag:");
        System.out.println(indent + "  Tag Name: " + tagName);
        if (!attributes.isEmpty()) {
            System.out.println(indent + "  Attributes:");
            for (ASTNode attr : attributes) {
                attr.prettyPrint(indent + "    ");
            }
        }
        if (!content.isEmpty()) {

            System.out.println(indent + "  Content:");
            for (ASTNode node : content) {
                node.prettyPrint(indent + "    ");
            }
        }
    }
}
