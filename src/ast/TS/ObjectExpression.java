package ast.TS;

import ast.ASTNode;

import java.util.LinkedHashMap;
import java.util.Map;

public class ObjectExpression implements ASTNode {
    private Map<String, ASTNode> properties;

    public ObjectExpression(Map<String, ASTNode> properties) {
        this.properties = properties;
    }

    public Map<String, ASTNode> getProperties() {
        return properties;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ObjectExpression:");
        for (Map.Entry<String, ASTNode> entry : properties.entrySet()) {
            System.out.print(indent + "  " + entry.getKey() + ": ");
            if (entry.getValue() != null) {
                entry.getValue().prettyPrint("");
            } else {
                System.out.println("null");
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{ ");
        for (Map.Entry<String, ASTNode> entry : properties.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append(", ");
        }
        if (!properties.isEmpty()) sb.setLength(sb.length() - 2); // remove last comma
        sb.append(" }");
        return sb.toString();
    }
}
