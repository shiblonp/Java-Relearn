package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        //double [] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        //double [] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        //char [] opCodes = {'d', 'a', 's', 'm'};
        //double [] results = new double [opCodes.length];

        //using classes
//        MathEquation [ ] equations = new MathEquation[4];
//        equations[0] = new MathEquation('d', 100.0d, 50.0d);
//        equations[1] = new MathEquation('a', 25.0d, 92.0d);
//        equations[2] = new MathEquation('s',225.0d, 17.0d);
//        equations[3] = new MathEquation('m',11.0d, 3.0d);
//
//        for(MathEquation equation : equations){
//            equation.execute();
//            System.out.println(equation.getResults());
//        }


        //checking the String properties with overriden toString property included
        String [] statements = {
                "Divide 100.0 50.0",
                "Add 25.0 92.0",
                "Subtract 225.0 17.0",
                "Multiply 11.0 3.0"
        };
        CalculateHelper helper = new CalculateHelper();
        for (String statement:statements){
            helper.process(statement);
            System.out.println(helper);
        }
//        //Using inheritance where each math function is inheriting from a base class
//        CalculateBase [] calculators = {
//                new Adder(25.0d,92.0d),
//                new Divider(100.0d, 50.0d),
//                new Multiplier(11.0d,3.0d),
//                new Subtractor(225.0d, 3.0d)
//        };
//        for (CalculateBase calculator : calculators){
//            calculator.Calculate();
//            System.out.println(calculator.getResults());
//        }
//    }
    //no longer need this method, the creation of the constructor will take care of this
//    public static MathEquation create(double leftVal, double rightVal, char opCode)
//    {
//        MathEquation equation = new MathEquation();
//        equation.setLeftVal(leftVal);
//        equation.setRightVal(rightVal);
//        equation.setOpCode(opCode);
//
//        return equation;
//    }
}}