package ast.CSS;

import ast.ASTNode;

import java.util.List;

public class RuleSet implements ASTNode {
    private RuleSetStart ruleSetStart;
    private List<Declaration> declarations;

    public RuleSet(RuleSetStart ruleSetStart, List<Declaration> declarations) {
        this.ruleSetStart = ruleSetStart;
        this.declarations = declarations;
    }

    public RuleSetStart getRuleSetStart() {
        return ruleSetStart;
    }

    public void setRuleSetStart(RuleSetStart ruleSetStart) {
        this.ruleSetStart = ruleSetStart;
    }

    public void setDeclarations(List<Declaration> declarations) {
        this.declarations = declarations;
    }

    public RuleSetStart getSelector() {
        return ruleSetStart;
    }

    public List<Declaration> getDeclarations() {
        return declarations;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "RuleSet:");
        ruleSetStart.prettyPrint(indent + "  ");
        System.out.println(indent + "  Declarations:");
        for (Declaration decl : declarations) {
            decl.prettyPrint(indent + "    ");
        }
    }
}