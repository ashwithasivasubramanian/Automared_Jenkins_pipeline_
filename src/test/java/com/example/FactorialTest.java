package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void testFactorialOf0() {
        Factorial f = new Factorial();
        assertEquals(1, f.compute(0)); // 0! = 1
    }

    @Test
    public void testFactorialOf1() {
        Factorial f = new Factorial();
        assertEquals(1, f.compute(1)); // 1! = 1
    }

    @Test
    public void testFactorialOf5() {
        Factorial f = new Factorial();
        assertEquals(120, f.compute(5)); // 5! = 120
    }

    @Test
    public void testFactorialOf10() {
        Factorial f = new Factorial();
        assertEquals(3628800, f.compute(10)); // 10! = 3628800
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput() {
        Factorial f = new Factorial();
        f.compute(-1); // Should throw exception
    }

    @Test
    public void testFactorialOf2() {
        Factorial f = new Factorial();
        assertEquals(2, f.compute(2)); // 2! = 2
    }

    @Test
    public void testFactorialOf3() {
        Factorial f = new Factorial();
        assertEquals(6, f.compute(3)); // 3! = 6
    }

    @Test
    public void testFactorialOf12() {
        Factorial f = new Factorial();
        assertEquals(479001600, f.compute(12)); // 12! = 479001600
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflow() {
        Factorial f = new Factorial();
        f.compute(20); // If int is used, this may overflow
    }
}
