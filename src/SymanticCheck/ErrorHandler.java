package SymanticCheck;

import ast.SymbolTable.Row;
import ast.SymbolTable.SymbolTable;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public abstract class ErrorHandler {
    private static final String ERROR_LOG_FILE = "errors.txt";

    public static void logError(Exception e, int lineNumber) {
        try (FileWriter writer = new FileWriter(ERROR_LOG_FILE, true)) {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            writer.write("=== COMPILATION ERROR ===\n");
            writer.write("Timestamp: " + timestamp + "\n");
            writer.write("Line: " + lineNumber + "\n");
            writer.write("Error: " + e.getMessage() + "\n");

        } catch (IOException ioException) {
            System.err.println("Failed to write to error log: " + ioException.getMessage());
        }
    }

    public void handleError(Exception e, int lineNumber) {
        // Log the error
        logError(e, lineNumber);

        // Print the error details to the console
        System.err.println("=== COMPILATION ERROR ===");
        System.err.println("Timestamp: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.err.println("Line: " + lineNumber);
        System.err.println("Error: " + e.getMessage());
    }


}
