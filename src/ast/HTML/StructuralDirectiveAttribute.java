package ast.HTML;

public class StructuralDirectiveAttribute implements HtmlAttribute {
    private final String name;
    private final TagAttribute tagAttribute;

    public StructuralDirectiveAttribute(String name, TagAttribute tagAttribute) {
        this.name = name;
        this.tagAttribute = tagAttribute;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public TagAttribute getTagAttribute() {
        return tagAttribute;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Structural Directive Attribute:");
        System.out.println(indent + "  Name: " + name);
        if (tagAttribute != null) tagAttribute.prettyPrint(indent + "  ");
    }
}
