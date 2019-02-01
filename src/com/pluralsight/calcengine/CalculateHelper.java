package com.pluralsight.calcengine;

public class CalculateHelper {
    private static final char ADD_SYMBOL = '+';
    private static final char MULT_SYMBOL = '*';
    private static final char DIV_SYMBOL = '/';
    private static final char SUB_SYMBOL = '-';
    MathCommand command;
    double leftValue;
    double rightValue;
    double result;

    public void process (String statement){
        String [] parts = statement.split(" ");
        String commandString = parts[0];
        leftValue= Double.parseDouble(parts[1]);
        rightValue= Double.parseDouble(parts[2]);

        setCommandFromString(commandString);

        CalculateBase calculator = null;

        switch (command){
            case Add:
                calculator=new Adder(leftValue,rightValue);
                break;
            case Subtract:
                calculator = new Subtractor(leftValue,rightValue);
                break;
            case Multiply:
                calculator = new Multiplier(leftValue,rightValue);
                break;
            case Divide:
                calculator = new Divider(leftValue,rightValue);
                break;}

        calculator.Calculate();
        result=calculator.getResults();


    }
    private void setCommandFromString(String commandString){
        if (commandString.equalsIgnoreCase(MathCommand.Add.toString()))
            command = MathCommand.Add;
        else if (commandString.equalsIgnoreCase(MathCommand.Subtract.toString()))
            command = MathCommand.Subtract;
        else if (commandString.equalsIgnoreCase(MathCommand.Divide.toString()))
            command = MathCommand.Divide;
        else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString()))
            command = MathCommand.Multiply;
    }
    //method override because the print only prints the hash code
    @Override
    public String toString()
    {
        char symbol = ' ';
        switch (command){
            case Add:
                symbol = ADD_SYMBOL;
                break;
            case Subtract:
                symbol = SUB_SYMBOL;
                break;
            case Multiply:
                symbol = MULT_SYMBOL;
                break;
            case Divide:
                symbol = DIV_SYMBOL;
                break;

        }
        StringBuilder sb = new StringBuilder(20);
        sb.append(leftValue);
        sb.append(' ');
        sb.append(symbol);
        sb.append(' ');
        sb.append(rightValue);
        sb.append(" = ");
        sb.append(result);

        return  sb.toString();

    }
}