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
        //including commands that will not process correctly
        String [] statements = {
                "add 1.0",
                "add xx 25.0",
                "addx 0.0 0.0",
                "Divide 100.0 50.0",
                "Add 25.0 92.0",
                "Subtract 225.0 17.0",
                "Multiply 11.0 3.0"
        };
        CalculateHelper helper = new CalculateHelper();
        //now I have to handle the throws that I declared in the process method
        for (String statement:statements){
            try{
            helper.process(statement);
            System.out.println(helper);}
            catch(InvalidStatementException e){
                System.out.println(e.getMessage());
                //Using the getCause method from the exceptions base class to be able to print the default message
                if (e.getCause()!= null)
                    //can use this when the exception is not from custom exception class
                    System.out.println("  Original exception: " + e.getCause().getMessage());
            }
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