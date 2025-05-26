package SymanticCheck;

public class UndefinedMethodCallError extends RuntimeException {
    public final int lineNumber;
    public final UndefinedMethodCallErrorSymbolTable undefinedMethodCallErrorSymbolTable;
    public final String methodName;


    public UndefinedMethodCallError(String methodName, int lineNumber, UndefinedMethodCallErrorSymbolTable symbolTable) {
        super("Undefined method call: " + methodName + " at line " + lineNumber);
        this.lineNumber = lineNumber;
        this.undefinedMethodCallErrorSymbolTable = symbolTable;
        this.methodName = methodName;
    }

    public void throwException() {
        undefinedMethodCallErrorSymbolTable.print();
        ErrorHandler.logError(this, lineNumber);
        throw this;
    }
}