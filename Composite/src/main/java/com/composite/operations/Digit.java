package com.composite.operations;

public class Digit implements Operation {
    private double number;

    public Digit(double number) {
        this.number = number;
    }

    public double execute() {
        return number;
    }
}
