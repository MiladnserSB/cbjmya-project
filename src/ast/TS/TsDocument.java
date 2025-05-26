package ast.TS;

import ast.ASTNode;
import java.util.List;

public class TsDocument implements ASTNode {
    private List<ImportStatement> imports;
    private ASTNode decorator; // Can be ComponentDecorator or InjectableDecorator, nullable
    private ClassDeclaration classDeclaration;

    public TsDocument(List<ImportStatement> imports, ASTNode decorator, ClassDeclaration classDeclaration) {
        this.imports = imports;
        this.decorator = decorator;
        this.classDeclaration = classDeclaration;
    }

    public List<ImportStatement> getImports() {
        return imports;
    }

    public ASTNode getDecorator() {
        return decorator;
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "TypeScript Document:");
        for (ImportStatement imp : imports) {
            imp.prettyPrint(indent + "  ");
        }

        if (decorator != null) {
            decorator.prettyPrint(indent + "  ");
        }

        if (classDeclaration != null) {
            classDeclaration.prettyPrint(indent + "  ");
        }
    }

    @Override
    public String toString() {
        return "TSDocument{" +
                "imports=" + imports +
                ", decorator=" + (decorator != null ? decorator.getClass().getSimpleName() : "none") +
                ", class=" + classDeclaration.getClassName() +
                '}';
    }
}