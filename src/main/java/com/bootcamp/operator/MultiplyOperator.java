package com.bootcamp.operator;

public class MultiplyOperator extends Operator {
    public MultiplyOperator() {}

    @Override
    public double operate(int a, int b) {
        return a * b;
    }
}