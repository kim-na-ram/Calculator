package com.bootcamp.calculator;

import com.bootcamp.calculator.operator.Operator;
import com.bootcamp.util.OperatorType;

import java.util.LinkedList;

public class ArithmeticCalculator extends Calculator {
    public ArithmeticCalculator() {
        // 결과 저장 배열 초기화
        this.resultQueue = new LinkedList<>();
    }

    public double calculate(int a, int b, char op) {
        // OperatorType 에서 알맞는 Operator 를 반환해준다.
        Operator operator = OperatorType.findByOperatorType(op);

        double result = operator.operate(a, b);
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