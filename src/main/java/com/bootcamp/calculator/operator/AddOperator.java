package com.bootcamp.calculator.operator;

public class AddOperator extends Operator {
    public AddOperator() {}

    @Override
    public int operate(int a, int b) {
        return a + b;
    }

    @Override
    public double operate(double a, double b) {
        return a + b;
    }
}