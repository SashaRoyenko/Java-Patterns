package com.composite.operations;

public class Add extends Expression {


    public Add(Operation leftOperand, Operation rightOperand) {
        super(leftOperand, rightOperand);
    }

    public double execute() {
        return leftOperand.execute() + rightOperand.execute();
    }
}
