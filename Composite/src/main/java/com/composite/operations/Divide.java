package com.composite.operations;

public class Divide extends Expression {
    public Divide(Operation leftOperand, Operation rightOperand) {
        super(leftOperand, rightOperand);
    }

    public double execute() {
        return leftOperand.execute() / rightOperand.execute();
    }
}
