package com.pluralsight.calcengine;

public class Divider extends CalculateBase {
    public Divider(){}
    public Divider(double leftVal, double rightVal)
    {
        super(leftVal,rightVal);
    }
    @Override
    public void Calculate(){
        double value = getLeftVal()/getRightVal();
        setResult (value);
    }
}
