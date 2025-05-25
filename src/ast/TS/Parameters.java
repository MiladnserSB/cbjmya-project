package ast.TS;

import ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class Parameters implements ASTNode {
    private List<String> names;
    private List<String> types;

    public Parameters() {
        this.names = new ArrayList<>();
        this.types = new ArrayList<>();
    }

    public void addParameter(String name, String type) {
        names.add(name);
        types.add(type);
    }

    public List<String> getNames() {
        return names;
    }

    public List<String> getTypes() {
        return types;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Parameters:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(indent + "  " + names.get(i) + ": " + types.get(i));
        }
    }

    @Override
    public String toString() {
        List<String> pairs = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            pairs.add(names.get(i) + ": " + types.get(i));
        }
        return String.join(", ", pairs);
    }
}
