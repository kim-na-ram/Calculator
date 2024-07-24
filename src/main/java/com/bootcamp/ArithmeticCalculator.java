package com.bootcamp;

import java.util.LinkedList;

public class ArithmeticCalculator extends Calculator {
    public ArithmeticCalculator() {
        resultQueue = new LinkedList<>();
    }

    public double calculate(int a, int b, char op) {
        double result;
        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            if (b == 0) {
                throw new CalculatorException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
            result = (double) a / b;
        } else {
            throw new CalculatorException(op + "는 잘못된 연산 기호입니다.");
        }

        resultQueue.add(result);
        return result;
    }

    @Override
    public void inquiryResults() {
        super.inquiryResults();
    }

    @Override
    public void removeResult() {
        super.removeResult();
    }
}
