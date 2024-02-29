package com.exp2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();

        // Calling methods of the Calculator class
        int resultAddition = calculator.add(5, 3);
        System.out.println("Result of addition: " + resultAddition);
    }
}
