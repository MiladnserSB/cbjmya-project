package ast.CSS;

import ast.ASTNode;
import java.util.List;

public class RuleSetStart implements ASTNode {
    private List<String> selectors;

    public RuleSetStart(List<String> selectors) {
        this.selectors = selectors;
    }

    public List<String> getSelectors() {
        return selectors;
    }

    public void setSelectors(List<String> selectors) {
        this.selectors = selectors;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Selectors:");
        if (selectors == null || selectors.isEmpty()) {
            System.out.println(indent + "  (Empty)");
        } else {
            for (String selector : selectors) {
                System.out.println(indent + "  " + selector);
            }
        }
    }
}
