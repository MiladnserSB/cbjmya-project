package SymanticCheck;

public class MissedTemplateError extends RuntimeException{
    public final int lineNumber;
    public  MissedTemplateErrorSymbolTable missedTemplateErrorSymbolTable;

    public MissedTemplateError(MissedTemplateErrorSymbolTable missedTemplateErrorSymbolTable, int lineNumber) {
        super("Missed TemplateUrl");
        this.lineNumber = lineNumber;
        this.missedTemplateErrorSymbolTable = missedTemplateErrorSymbolTable;
    }

    public void throwException() {
        missedTemplateErrorSymbolTable.print();
        ErrorHandler.logError(this, lineNumber);
        throw this;
    }
}
