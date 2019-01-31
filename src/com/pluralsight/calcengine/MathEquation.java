package com.pluralsight.calcengine;

//Class creation exercise from the pluralsight website

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode = 'a';
    private double result;

    public double getRightVal(){
        return rightVal;
    }
    public void setRightVal(double rightVal){
        this.rightVal=rightVal;
    }
    public double getLeftVal(){
        return leftVal;
    }
    public void setLeftVal(double leftVal){
        this.leftVal=leftVal;
    }
    public char getOpCode(){
        return opCode;
    }
    public void setOpCode(char opCode){
        this.opCode=opCode;
    }
    public double getResults(){return result;}

    //default constructor
    public MathEquation(){}

    public MathEquation(char opCode){
        this.opCode= opCode;
    }
    public MathEquation(char opCode, double leftVal, double rightVal){
        //to create the constructor chain
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal= rightVal;

    }

    public void execute()
    {
        switch(opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal == 0.0d ? 0.0d : leftVal / rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;
        }
    }
}
