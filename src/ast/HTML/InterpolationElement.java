package ast.HTML;

public class InterpolationElement implements HtmlElement {
    private final String content;

    public InterpolationElement(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Interpolation: " + content);
    }
}
