package SymanticCheck;

import ast.SymbolTable.SymbolTable;
import ast.SymbolTable.Row;

public class AlreadyDefinedVariableError extends RuntimeException {
    public final String variableName;
    public final int lineNumber;
    public  AlreadyDefinedVariableErrorSymbolTable alreadyDefinedVariableErrorSymbolTable;

    public AlreadyDefinedVariableError(String variableName, AlreadyDefinedVariableErrorSymbolTable symbolTable, int lineNumber) {
        super("Already defined variable: " + variableName);
        this.variableName = variableName;
        this.lineNumber = lineNumber;
        this.alreadyDefinedVariableErrorSymbolTable = symbolTable;
    }

    public void throwException() {
        alreadyDefinedVariableErrorSymbolTable.print();
        ErrorHandler.logError(this, lineNumber);
        throw this;
    }
}
