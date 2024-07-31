package com.bootcamp.calculator.operator;

import com.bootcamp.calculator.CalculatorException;

public class DivideOperator extends Operator {
    public DivideOperator() {}

    @Override
    public int operate(int a, int b) {
        checkDenominator(b);
        return a / b;
    }

    @Override
    public double operate(double a, double b) {
        checkDenominator(b);
        return a / b;
    }

    private void checkDenominator(int b) {
        if (b == 0) {
            throw new CalculatorException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }
    }

    private void checkDenominator(double b) {
        if (b == 0.0) {
            throw new CalculatorException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }
    }
}