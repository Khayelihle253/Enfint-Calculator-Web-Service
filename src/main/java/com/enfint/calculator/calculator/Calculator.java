package com.enfint.calculator.calculator;

public class Calculator {
    private double first_number;
    private double second_number;
    private double result;
    public Calculator(double first_number, double second_number, double result){
        this.first_number = first_number;
        this.second_number = second_number;
        this.result = result;
    }

    public double getFirst_number() {
        return first_number;
    }

    public double getSecond_number() {
        return second_number;
    }

    public double getResult() {
        return result;
    }
}
