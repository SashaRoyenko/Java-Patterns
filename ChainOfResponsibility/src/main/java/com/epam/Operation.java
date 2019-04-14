package com.epam;

public abstract class Operation {
    Operation next;
    public Operation(){}
    void nextOperation(Operation operation){
        next = operation;
    }
    abstract void makeOperation(Payment payment);
}
