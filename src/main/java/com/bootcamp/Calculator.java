package com.bootcamp;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    // Calculator 객체가 여러 개 만들어져도 공통으로 사용할 수 있도록 static 선언
    private static Queue<Integer> resultQueue;
    private static Queue<Double> circleAreaResultQueue;

    public Queue<Integer> getResultQueue() {
        return resultQueue;
    }

    public void setResultQueue(Queue<Integer> resultQueue) {
        Calculator.resultQueue = resultQueue;
    }

    public Queue<Double> getCircleAreaResultQueue() {
        return circleAreaResultQueue;
    }

    public void setCircleAreaResultQueue(Queue<Double> circleAreaResultQueue) {
        Calculator.circleAreaResultQueue = circleAreaResultQueue;
    }

    public Calculator() {
        resultQueue = new LinkedList<>();
        circleAreaResultQueue = new LinkedList<>();
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

    public void inquiryResults() {
        resultQueue.forEach(System.out::println);
    }

    public double calculateCircleArea(int r) {
        double result = Math.pow(r, 2) * Math.PI;
        circleAreaResultQueue.offer(result);
        return result;
    }

    public void inquiryCircleAreaResults() {
        circleAreaResultQueue.forEach(System.out::println);
    }

}
