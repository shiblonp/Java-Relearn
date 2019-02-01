package com.pluralsight.calcengine;

//Shiblon Pahulu Feb1
//adding custom exception class with 2 constructors
public class InvalidStatementException extends Exception {
    public InvalidStatementException(String reason, String statement)
    {
        super(reason+ " " + statement);
    }
    public InvalidStatementException(String reason, String statement,Throwable cause)
    {
        super(reason+ " " + statement, cause);
    }
}
