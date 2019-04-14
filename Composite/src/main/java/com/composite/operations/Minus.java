package com.composite.operations;

public class Minus extends Expression {
    public Minus(Operation leftOperand, Operation rightOperand) {
        super(leftOperand, rightOperand);
    }

    public double execute() {
        return leftOperand.execute() - rightOperand.execute();
    }
}
