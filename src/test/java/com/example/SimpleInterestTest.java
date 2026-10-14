
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleInterestTest {

    SimpleInterest si = new SimpleInterest();

    @Test
    void testNormalInterest() {
        assertEquals(1000.0,
                si.calculateSimpleInterest(10000, 5, 2));
    }

    @Test
    void testZeroPrincipal() {
        assertEquals(0.0,
                si.calculateSimpleInterest(0, 5, 2));
    }

    @Test
    void testZeroRate() {
        assertEquals(0.0,
                si.calculateSimpleInterest(10000, 0, 2));
    }

    @Test
    void testZeroTime() {
        assertEquals(0.0,
                si.calculateSimpleInterest(10000, 5, 0));
    }

    @Test
    void testSmallAmount() {
        assertEquals(50.0,
                si.calculateSimpleInterest(1000, 5, 1));
    }

    @Test
    void testDecimalValues() {
        assertEquals(75.0,
                si.calculateSimpleInterest(2500, 3, 1));
    }

    @Test
    void testLongDuration() {
        assertEquals(5000.0,
                si.calculateSimpleInterest(10000, 5, 10));
    }
}
