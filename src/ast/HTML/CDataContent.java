package ast.HTML;

import ast.ASTNode;

public class CDataContent implements ASTNode {
    private final String content;

    public CDataContent(String content) {
        this.content = content;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "CDATA: " + content);
    }
}