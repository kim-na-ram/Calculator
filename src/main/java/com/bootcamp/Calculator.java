package com.bootcamp;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    private static Queue<Integer> resultQueue = new LinkedList<>();

    public Queue<Integer> getResultQueue() {
        return resultQueue;
    }

    public void setResultQueue(Queue<Integer> resultQueue) {
        Calculator.resultQueue = resultQueue;
    }

    public int calculate(int a, int b, char op) {
        int result;
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
            result = a / b;
        } else {
            throw new CalculatorException(op + "는 잘못된 연산 기호입니다.");
        }

        resultQueue.add(result);
        return result;
    }

    public void removeResult() {
        if(!resultQueue.isEmpty()) {
            resultQueue.poll();
        }
    }
}
