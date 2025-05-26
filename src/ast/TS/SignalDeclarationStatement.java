package ast.TS;

import ast.ASTNode;

public class SignalDeclarationStatement implements ASTNode {
    private String name;
    private String signalType; // Value of CROISNN, e.g. "signal"
    private String argument;   // The string literal passed to the signal

    public SignalDeclarationStatement(String name, String signalType, String argument) {
        this.name = name;
        this.signalType = signalType;
        this.argument = argument;
    }

    public String getName() {
        return name;
    }

    public String getSignalType() {
        return signalType;
    }

    public String getArgument() {
        return argument;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Signal Declaration:");
        System.out.println(indent + "  Name: " + name);
        System.out.println(indent + "  Type: " + signalType);
        System.out.println(indent + "  Argument: " + argument);
    }

    @Override
    public String toString() {
        return name + " = " + signalType + "(\"" + argument + "\");";
    }
}
