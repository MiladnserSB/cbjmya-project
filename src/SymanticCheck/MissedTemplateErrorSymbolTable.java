package SymanticCheck;

import ast.SymbolTable.Row;
import ast.SymbolTable.SymbolTable;

public class MissedTemplateErrorSymbolTable extends SymbolTable {
    public boolean check(String key) {
        return this.getRow(key )!= null;
    }

}
