package com.bootcamp;

import java.util.LinkedList;

public class CircleCalculator extends Calculator {
    public CircleCalculator() {
        resultQueue = new LinkedList<>();
    }

    public double calculate(int r) {
        double result = Math.pow(r, 2) * Math.PI;
        resultQueue.offer(result);
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
