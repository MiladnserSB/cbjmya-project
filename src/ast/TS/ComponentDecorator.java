package ast.TS;
import ast.ASTNode;
public class ComponentDecorator implements ASTNode {

    private ComponentProperties componentProperties; // Component properties (optional)

    public ComponentDecorator(ComponentProperties componentProperties) {
        this.componentProperties = componentProperties;
    }

    public ComponentProperties getComponentProperties() {
        return componentProperties;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Component Decorator:");
        if (componentProperties != null) {
            componentProperties.prettyPrint(indent + "  ");
        } else {
            System.out.println(indent + "  No properties");
        }
    }
}