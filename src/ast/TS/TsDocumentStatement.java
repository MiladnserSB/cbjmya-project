package ast.TS;

import ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class TsDocumentStatement implements ASTNode {
    private final List<ASTNode> contents;

    public TsDocumentStatement(List<ASTNode> contents) {
        this.contents = contents != null ? contents : new ArrayList<>();
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "TS Document Statement:");
        for (ASTNode content : contents) {
            if (content != null) {
                content.prettyPrint(indent + "  ");
            } else {
                System.out.println(indent + "  [Null Content]");
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (ASTNode content : contents) {
            sb.append(content.toString()).append("\n");
        }
        return sb.toString().trim();
    }
}
