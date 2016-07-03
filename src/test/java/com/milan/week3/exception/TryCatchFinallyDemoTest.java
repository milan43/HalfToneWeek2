/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milan.week3.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Meelon
 */
public class TryCatchFinallyDemoTest {

    private final TryCatchFinallyDemo demo = new TryCatchFinallyDemo();

    public TryCatchFinallyDemoTest() {
    }

    @Test
    @Ignore
    public void testTryBlock() {
        demo.tryBlock();
    }
    @Test
    @Ignore
    public void testTryCatchBlock() {
        demo.tryCatchBlock();
    }

    @Test
    public void testMultipleCatch() {
        demo.multipleCatch();
    }

    @Test
    public void testSingleMultipleCatch() {
        demo.singleMultipleCatch();
    }

    @Test
    public void testFinallyDemo() {
        demo.finallyDemo();
    }
}
