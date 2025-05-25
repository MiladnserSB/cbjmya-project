package ast.TS;

import ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class ImportStatement implements ASTNode {
    private List<ImportBody> importedItems;
    private String sourcePath;

    public ImportStatement(List<ImportBody> importedItems, String sourcePath) {
        this.importedItems = importedItems;
        this.sourcePath = sourcePath;
    }

    public List<ImportBody> getImportedItems() {
        return importedItems;
    }

    public String getSourcePath() {
        return sourcePath;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Import Statement:");
        for (ImportBody item : importedItems) {
            item.prettyPrint(indent + "  ");
        }
        System.out.println(indent + "  From: " + sourcePath);
    }

    @Override
    public String toString() {
        List<String> names = new ArrayList<>();
        for (ImportBody item : importedItems) {
            names.add(item.getName());
        }
        return "import { " + String.join(", ", names) + " } from \"" + sourcePath + "\";";
    }
}
