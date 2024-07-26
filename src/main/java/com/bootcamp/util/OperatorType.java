package com.bootcamp.util;

import com.bootcamp.calculator.CalculatorException;
import com.bootcamp.calculator.operator.*;
import java.util.Arrays;

public enum OperatorType {
    ADD('+', new AddOperator()),
    SUBTRACT('-', new SubtractOperator()),
    DIVIDE('/', new DivideOperator()),
    MODE('%', new ModeOperator()),
    MULTIPLY('*', new MultiplyOperator());

    // 해당 enum 은 상수처럼 사용, 변경이 불가능해야 하므로 final 로 선언
    private final char operatorType;
    private final Operator operator;

    OperatorType(char operatorType, Operator operator) {
        this.operatorType = operatorType;
        this.operator = operator;
    }

    public char getOperatorType() {
        return operatorType;
    }

    public Operator getOperator() {
        return operator;
    }

    public static Operator findByOperatorType(char operatorType) {
        return Arrays.stream(OperatorType.values())
                .filter(ot -> ot.operatorType == operatorType)
                .findAny()
                .orElseThrow(() -> new CalculatorException("잘못된 연산 기호입니다."))
                .getOperator();
    }
}