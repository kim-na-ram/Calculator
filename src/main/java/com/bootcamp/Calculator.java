package com.bootcamp;

import java.util.Queue;

public abstract class Calculator {
    public Queue<Double> resultQueue;
    public void removeResult() {
        if(!resultQueue.isEmpty()) {
            resultQueue.poll();
        }
    }

    public void inquiryResults() {
        resultQueue.forEach(System.out::println);
    }

}