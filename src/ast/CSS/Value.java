package ast.CSS;

import ast.ASTNode;

public class Value implements ASTNode {
    private String value;
    private String unit;
    private ValueType type;

    public Value(String value, String unit, ValueType type) {
        this.value = value;
        this.unit = unit;
        this.type = type;
    }

    public enum ValueType {
        NUMBER, COLOR, STRING, KEYWORD, IDENTIFIER
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public ValueType getType() {
        return type;
    }

    public void setType(ValueType type) {
        this.type = type;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.print(indent + value + (unit != null ? unit : ""));
    }
}