package com.exp2;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    public void addTest() {
        Calculator calculator = new Calculator();
        
        // Test case 1: Addition of positive numbers
        assertEquals(8, calculator.add(5, 3));

}}
