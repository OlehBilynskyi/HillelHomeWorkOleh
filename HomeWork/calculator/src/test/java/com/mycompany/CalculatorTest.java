package com.mycompany;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5.0, calculator.add(2, 3), 0.0001);
    }

    @Test
    public void testSubtraction() {
        assertEquals(1.0, calculator.subtract(3, 2), 0.0001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, calculator.multiply(2, 3), 0.0001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.divide(6, 3), 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        calculator.divide(1, 0);
    }
}
