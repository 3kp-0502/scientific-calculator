package com.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    private Calculator calculator = new Calculator();
    
    @Test
    public void testSquareRoot() {
        assertEquals(4.0, calculator.squareRoot(16), 0.001);
        assertEquals(5.0, calculator.squareRoot(25), 0.001);
        assertEquals(0.0, calculator.squareRoot(0), 0.001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSquareRootNegative() {
        calculator.squareRoot(-4);
    }
    
    @Test
    public void testFactorial() {
        assertEquals(1, calculator.factorial(0));
        assertEquals(1, calculator.factorial(1));
        assertEquals(2, calculator.factorial(2));
        assertEquals(6, calculator.factorial(3));
        assertEquals(24, calculator.factorial(4));
        assertEquals(120, calculator.factorial(5));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        calculator.factorial(-1);
    }
    
    @Test
    public void testNaturalLog() {
        assertEquals(0.0, calculator.naturalLog(1), 0.001);
        assertEquals(1.0, calculator.naturalLog(Math.E), 0.001);
        assertEquals(2.302, calculator.naturalLog(10), 0.01);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNaturalLogNegative() {
        calculator.naturalLog(-1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNaturalLogZero() {
        calculator.naturalLog(0);
    }
    
    @Test
    public void testPower() {
        assertEquals(8.0, calculator.power(2, 3), 0.001);
        assertEquals(1.0, calculator.power(5, 0), 0.001);
        assertEquals(100.0, calculator.power(10, 2), 0.001);
        assertEquals(0.25, calculator.power(2, -2), 0.001);
    }
}
