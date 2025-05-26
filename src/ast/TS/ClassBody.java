package ast.TS;

import ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class ClassBody implements ASTNode {
    private final List<ClassBodyStatement> members;

    public ClassBody() {
        this.members = new ArrayList<>();
    }

    public void addMember(ClassBodyStatement member) {
        this.members.add(member);
    }

    public List<ClassBodyStatement> getMembers() {
        return members;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Class Body:");
        for (ClassBodyStatement member : members) {
            member.prettyPrint(indent + "  ");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (ClassBodyStatement member : members) {
            sb.append(member.toString()).append("\n");
        }
        return sb.toString().trim();
    }
}
