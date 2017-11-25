package com.mindtree.ArithmeticOperations;
import java.awt.*;
/**
 * @author Ranjith Ranganathan
 * @version : 1
 * @date 2018-11-10
 */
public class ArithmeticOperations 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    /**
     * Method to find the sum of entered two numbers.
     * @param firstNum , not null
     * @param secondNum , not null
     * @return
     */
    public int performAddition(final int firstNum, final int secondNum) {
    	int sum = 0; // Left unused to get reflected in static code analyzing tool.
    	return firstNum + secondNum;
    }
    /**
     * Method to find the difference between two numbers.
     * @param firstNum , not null
     * @param secondNum , not null
     * @return
     */
    public int performSubtraction(final int firstNum, final int secondNum) {
    	return firstNum - secondNum;
    }
    /**
     * Method to find the product of two numbers.
     * @param firstNum , not null
     * @param secondNum , not null
     * @return
     */
    public int performMultiplication(final int firstNum, final int secondNum) {
    	return firstNum * secondNum;
    }
    /**
     * 
     * Method to return the remainder got when dividing two numbers.
     * @param firstNum , not null
     * @param secondNum , not null
     * @return
     */
    public int getRemainder(final int firstNum, final int secondNum) {
    	return firstNum % secondNum;
    }
    /**
     * 
     * Method to return the quotient from dividing two numbers.
     * @param firstNum , not null
     * @param secondNum , not null
     * @return
     */
    public int getQuotient(final int firstNum, final int secondNum) {
    	int quotient = 0;
    	try {
    		quotient = firstNum / secondNum;
    	}
    	catch(ArithmeticException ex) {
    		System.out.println ("Can't be divided by Zero" + ex);
    	}
    	return quotient;
    }
	
}
