package ast;

public class CDataContent implements ASTNode {
    private final String cdata;

    public CDataContent(String cdata) {
        this.cdata = cdata;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "CDATA: " + cdata);
    }
}