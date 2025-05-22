package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void testFactorialOf5() {
        Factorial f = new Factorial();
        assertEquals(120, f.compute(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput() {
        Factorial f = new Factorial();
        f.compute(-1);
    }

    @Test
    public void testFactorialOf0() {
        Factorial f = new Factorial();
        assertEquals(1, f.compute(0)); 
    }

    @Test
    public void testFactorialOf3() {
        Factorial f = new Factorial();
        assertEquals(6, f.compute(3));
    }
}

