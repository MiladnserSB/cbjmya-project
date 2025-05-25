package SymanticCheck;

public class UndefinedImportsError extends RuntimeException{
    public final String importName;
    public final int lineNumber;
    public  UndefinedImportsErrorSymbolTable undefinedImportsErrorSymbolTable;

    public UndefinedImportsError(String importName, UndefinedImportsErrorSymbolTable symbolTable, int lineNumber) {
        super("Undefined import: " + importName);
        this.importName = importName;
        this.lineNumber = lineNumber;
        this.undefinedImportsErrorSymbolTable = symbolTable;
    }

    public void throwException() {
        undefinedImportsErrorSymbolTable.print();
        ErrorHandler.logError(this, lineNumber);
        throw this;
    }
}
