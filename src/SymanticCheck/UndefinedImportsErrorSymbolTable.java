package SymanticCheck;

import ast.SymbolTable.SymbolTable;

public class UndefinedImportsErrorSymbolTable extends SymbolTable {

    public boolean check(String importName) {
        return this.getRow(importName) != null;
    }
}
