package SymanticCheck;

import ast.SymbolTable.SymbolTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UndefinedMethodCallErrorSymbolTable extends SymbolTable {
    public boolean check(String key) {
        return this.getRow(key) != null;
    }


}