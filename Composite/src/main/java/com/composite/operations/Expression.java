package com.composite.operations;

public abstract class Expression implements Operation{
    protected Operation leftOperand;
    protected Operation rightOperand;

    public Expression(Operation leftOperand, Operation rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }
}
