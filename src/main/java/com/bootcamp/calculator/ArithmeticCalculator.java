package com.bootcamp.calculator;

import com.bootcamp.calculator.operator.Operator;
import com.bootcamp.util.OperatorType;

import java.util.LinkedList;
import java.util.List;

public class ArithmeticCalculator extends Calculator {
    public ArithmeticCalculator() {
        // 결과 저장 배열 초기화
        this.resultQueue = new LinkedList<>();
    }

    public <T extends Number> T calculate(Double a, Double b, char op) {
        // OperatorType 에서 알맞는 Operator 를 반환해준다.
        Operator operator = OperatorType.findByOperatorType(op);

        T result;
        if(checkIsIntegerType(a) && checkIsIntegerType(b)) {
            result = (T) Integer.valueOf(operator.operate(a.intValue(), b.intValue()));
        } else {
            result = (T) Double.valueOf(operator.operate(a, b));
        }

        resultQueue.add(result);
        return result;
    }

    private boolean checkIsIntegerType(Double n) {
        return n.intValue() == n;
    }

    public <T extends Number> List<Number> inquiryForBiggerResults(T result) {
        return resultQueue.stream().filter(i -> result.doubleValue() < i.doubleValue()).toList();
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