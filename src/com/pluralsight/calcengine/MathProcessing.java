package com.pluralsight.calcengine;

//creating interface to make application more abstract
public interface MathProcessing {
    String SEPERATOR = " ";
    String getKeyword();
    char getSymbol();
    double doCalculation(double leftVal, double rightVal);
}
