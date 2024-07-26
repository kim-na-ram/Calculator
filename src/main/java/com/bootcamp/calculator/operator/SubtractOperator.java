package com.bootcamp.calculator.operator;

public class SubtractOperator extends Operator {
    public SubtractOperator() {}

    @Override
    public double operate(int a, int b) {
        return a - b;
    }
}