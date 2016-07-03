/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milan.week3.exception;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Meelon
 */
public class ThrowAndThroesDemoTest {

    private final ThrowAndThroesDemo demoTest = new ThrowAndThroesDemo();

    @Test
    public void testAddition1() {
        demoTest.addition1(10, 12);
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddition1_1() {
        demoTest.addition1("a", 12);
    }

    @Test(expected = ClassNotFoundException.class)
    public void testAddition2() throws Exception {
        demoTest.addition2(12, 10);

    }

    @Test(expected = InterruptedException.class)
    public void testAddition2_1() throws Exception {
        demoTest.addition2("b", 10);

    }

}
