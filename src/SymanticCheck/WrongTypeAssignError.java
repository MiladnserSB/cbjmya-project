package SymanticCheck;

import antlr.Parsergrammar;
import ast.SymbolTable.Row;
import ast.SymbolTable.SymbolTable;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class WrongTypeAssignError extends RuntimeException {
    private int lineNumber;
    private static final String ERROR_LOG_FILE = "errors.txt";
    public SymbolTable wrongTypeAssignErrorsymbolTable;

    public WrongTypeAssignError(String message, int lineNumber) {
        super(message + " at line " + lineNumber);
        this.lineNumber = lineNumber;
    }

    public WrongTypeAssignError() {

    }

    public int getLineNumber() {
        return lineNumber;
    }


    public boolean check(String targetType, String sourceType) {
        // Handle null case (can be assigned to any type)
        if ("null".equals(sourceType)) {
            return true;
        }
        return targetType.equals(sourceType);
    }


    public void throwIfUndefined() throws AlreadyDefinedVariableError {
        this.wrongTypeAssignErrorsymbolTable.print();
        logError();
        throw this;

    }

    private void logError() {
        try (FileWriter writer = new FileWriter(ERROR_LOG_FILE, true)) {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            writer.write("=== COMPILATION ERROR ===\n");
            writer.write("Timestamp: " + timestamp + "\n");
            writer.write("Line: " + lineNumber + "\n");
            writer.write("Error: " + getMessage() + "\n");
            writer.write("\nCurrent Symbol Table:\n");
            writer.write(getSymbolTableAsString());
            writer.write("\n\n"); // Separate errors with blank lines
        } catch (IOException e) {
            System.err.println("Failed to write to error log: " + e.getMessage());
        }
    }

    private String getSymbolTableAsString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Current Scope: ").append(wrongTypeAssignErrorsymbolTable.getCurrentScope()).append("\n");
        sb.append("Defined Variables:\n");
        for (Map.Entry<String, Row> entry : wrongTypeAssignErrorsymbolTable.getAllRows().entrySet()) {
            Row row = entry.getValue();
            sb.append("- ")
                    .append(row.getName())
                    .append(" : ")
                    .append(row.getType())
                    .append(" = ")
                    .append(row.getValue())
                    .append("\n");
        }

        return sb.toString();
    }

    public String getValueType(Parsergrammar.ValuesContext ctx) {
        if (ctx.NUMBER() != null) {
            return "number";
        }
        if (ctx.BOOLEAN() != null) {
            return "boolean";
        }
        if (ctx.STRING_LITERAL() != null) {
            return "string";
        }
        if (ctx.NULL() != null) {
            return "null";
        }
        return "unknown";
    }

}