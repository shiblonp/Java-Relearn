package com.pluralsight.calcengine;

import static java.lang.Math.pow;

public class PowerOf implements MathProcessing {
    @Override
    public String getKeyword() {
        return "power";
    }

    @Override
    public char getSymbol() {
        return '^';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        return Math.pow(leftVal,rightVal);
    }
}
