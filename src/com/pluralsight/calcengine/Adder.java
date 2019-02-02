package com.pluralsight.calcengine;

public class Adder extends CalculateBase implements MathProcessing{
    public Adder(){}
    public Adder(double leftVal, double rightVal)
    {
        super(leftVal,rightVal);
    }
    @Override
    public void Calculate(){
        double value = getLeftVal()+getRightVal();
        setResult (value);
    }
    @Override
    public String getKeyword() {
        return "Add";
    }
    @Override
    public char getSymbol (){
        return  '+';
    }
    @Override
    public double doCalculation(double leftVal, double rightVal){
        setLeftVal(leftVal);
        setRightVal(rightVal);
        Calculate();
        return  getResults();
    }
}
