package com.pluralsight.calcengine;

public abstract class CalculateBase {
        private double leftVal;
        private double rightVal;
        private double result;

        //getters and setters
        public double getRightVal(){ return rightVal; }
        public void setRightVal(double rightVal){ this.rightVal=rightVal; }
        public double getLeftVal(){ return leftVal; }
        public void setLeftVal(double leftVal){ this.leftVal=leftVal; }
        public double getResults(){return result;}
        public void setResult(double result){this.result=result;}

        public CalculateBase(){ }
        public CalculateBase(double leftVal, double rightVal){
            this.leftVal=leftVal;
            this.rightVal=rightVal;
        }
        public abstract void Calculate();
}
