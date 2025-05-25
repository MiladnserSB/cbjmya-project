package SymanticCheck;
import ast.SymbolTable.SymbolTable;


public class AlreadyDefinedVariableErrorSymbolTable extends SymbolTable {

    public boolean check(String variableName) {
        return this.getRow(variableName) != null;
    }
}
