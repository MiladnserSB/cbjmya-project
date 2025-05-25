package ast.HTML;

import ast.ASTNode;

public class ScriptletOrSeaWs implements ASTNode {
    private String content;
    private boolean isScriptlet;

    public ScriptletOrSeaWs(String content, boolean isScriptlet) {
        this.content = content;
        this.isScriptlet = isScriptlet;
    }

    public String getContent() {
        return content;
    }

    public boolean isScriptlet() {
        return isScriptlet;
    }

    @Override
    public void prettyPrint(String indent) {
        String type = isScriptlet ? "Scriptlet" : "SeaWs";
        System.out.println(indent + type + ": " + content);
    }
}