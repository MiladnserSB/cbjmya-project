package ast.HTML;

import ast.ASTNode;
import java.util.List;

public class HTMLDocument implements ASTNode {
    private final List<ASTNode> scriptletOrSeaWs;
    private final String xml;
    private final String dtd;
    private final List<ASTNode> htmlElements;

    public HTMLDocument(List<ASTNode> scriptletOrSeaWs, String xml, String dtd, List<ASTNode> htmlElements) {
        this.scriptletOrSeaWs = scriptletOrSeaWs != null ? scriptletOrSeaWs : List.of();
        this.xml = xml;
        this.dtd = dtd;
        this.htmlElements = htmlElements != null ? htmlElements : List.of();
    }

    // Getters
    public List<ASTNode> getScriptletOrSeaWs() { return scriptletOrSeaWs; }
    public String getXml() { return xml; }
    public String getDtd() { return dtd; }
    public List<ASTNode> getHtmlElements() { return htmlElements; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "HTML Document:");

        if (xml != null) {
            System.out.println(indent + "  XML Declaration: " + xml);
        }
        if (dtd != null) {
            System.out.println(indent + "  DTD: " + dtd);
        }

        if (!scriptletOrSeaWs.isEmpty()) {
            System.out.println(indent + "  Pre-content:");
            for (ASTNode node : scriptletOrSeaWs) {
                if (node != null) {
                    node.prettyPrint(indent + "    ");
                }
            }
        }

        if (!htmlElements.isEmpty()) {
            System.out.println(indent + "  Elements:");
            for (ASTNode node : htmlElements) {
                if (node != null) {
                    node.prettyPrint(indent + "    ");
                } else {
                    System.out.println(indent + "    [Null Element]");
                }
            }
        }
    }
}