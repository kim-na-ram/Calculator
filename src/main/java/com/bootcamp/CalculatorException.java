package com.bootcamp;

public class CalculatorException extends RuntimeException {
    public CalculatorException() {
    }

    public CalculatorException(String message) {
        super(message);
    }
}