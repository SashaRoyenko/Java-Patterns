package com.composite.operations;

public class Multiply extends Expression {
    public Multiply(Operation leftOperand, Operation rightOperand) {
        super(leftOperand, rightOperand);
    }

    public double execute() {
        return leftOperand.execute() * rightOperand.execute();
    }
}
