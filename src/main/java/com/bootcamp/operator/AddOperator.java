package com.bootcamp.operator;

public class AddOperator extends Operator {
    public AddOperator() {}
    @Override
    public double operate(int a, int b) {
        return a + b;
    }
}