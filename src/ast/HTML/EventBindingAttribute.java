package ast.HTML;

public class EventBindingAttribute implements HtmlAttribute {
    private final String name;
    private final TagAttribute tagAttribute;

    public EventBindingAttribute(String name, TagAttribute tagAttribute) {
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
        System.out.println(indent + "Event Binding Attribute:");
        System.out.println(indent + "  Name: " + name);
        if (tagAttribute != null) tagAttribute.prettyPrint(indent + "  ");
    }
}
