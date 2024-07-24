package com.bootcamp;

import com.bootcamp.operator.*;

import java.util.LinkedList;

public class ArithmeticCalculator extends Calculator {
    // 연산 수행 클래스들은 변경되지 않아야 하므로 final 선언
    private final AddOperator addOperator;
    private final SubtractOperator subtractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;
    private final ModeOperator modeOperator;

    public ArithmeticCalculator() {
        // 결과 저장 배열 초기화
        this.resultQueue = new LinkedList<>();

        // 연산 수행 클래스 초기화
        this.addOperator = new AddOperator();
        this.subtractOperator = new SubtractOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.divideOperator = new DivideOperator();
        this.modeOperator = new ModeOperator();
    }

    public double calculate(int a, int b, char op) {
        double result;
        if (op == '+') {
            result = addOperator.operate(a, b);
        } else if (op == '-') {
            result = subtractOperator.operate(a, b);
        } else if (op == '*') {
            result = multiplyOperator.operate(a, b);
        } else if (op == '/') {
            result = divideOperator.operate(a, b);
        } else if(op == '%') {
            result = modeOperator.operate(a, b);
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
