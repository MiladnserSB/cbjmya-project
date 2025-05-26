package ast.TS;

import ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class ImplementsClause implements ASTNode {
    private List<String> interfaces;

    public ImplementsClause() {
        this.interfaces = new ArrayList<>();
    }

    public ImplementsClause(List<String> interfaces) {
        this.interfaces = interfaces;
    }

    public void addInterface(String iface) {
        this.interfaces.add(iface);
    }

    public List<String> getInterfaces() {
        return interfaces;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Implements:");
        for (String iface : interfaces) {
            System.out.println(indent + "  " + iface);
        }
    }

    @Override
    public String toString() {
        return "Implements " + String.join(", ", interfaces);
    }
}
