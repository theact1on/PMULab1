package com.luparev.lab1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void min_isCorrect_2_4() {
        assertEquals(2, MinMaxClass.min(2,4));
    }
    @Test
    public void min_isCorrect_4_2() {
        assertEquals(2, MinMaxClass.min(4,2));
    }
    @Test
    public void min_isCorrect_neg2_neg4() {
        assertEquals(-4, MinMaxClass.min(-2,-4));
    }
    @Test
    public void min_isCorrect_neg4_neg2() {
        assertEquals(-4, MinMaxClass.min(-4,-2));
    }

    @Test
    public void max_isCorrect_2_4() {
        assertEquals(4, MinMaxClass.max(2,4));
    }
    @Test
    public void max_isCorrect_4_2() {
        assertEquals(4, MinMaxClass.max(4,2));
    }
    @Test
    public void max_isCorrect_neg2_neg4() {
        assertEquals(-2, MinMaxClass.max(-2,-4));
    }
    @Test
    public void max_isCorrect_neg4_neg2() {
        assertEquals(-2, MinMaxClass.max(-4,-2));
    }
}