package com.pluralsight.calcengine;

public class Multiplier extends CalculateBase {
    public Multiplier(){}
    public Multiplier(double leftVal, double rightVal)
    {
        super(leftVal,rightVal);
    }
    @Override
    public void Calculate(){
        double value = getLeftVal()*getRightVal();
        setResult (value);
    }
}
