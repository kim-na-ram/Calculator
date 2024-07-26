package com.bootcamp.calculator.operator;

public class ModeOperator extends Operator {
    public ModeOperator() {}

    @Override
    public double operate(int a, int b) {
        return a % b;
    }
}
