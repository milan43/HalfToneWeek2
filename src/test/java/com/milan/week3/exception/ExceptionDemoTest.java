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
public class ExceptionDemoTest {

    private final ExceptionDemo exceptionDemo = new ExceptionDemo();
    
    public ExceptionDemoTest() {
    }
    
    @Test(expected = NullPointerException.class)
    public void testNullPointerException() {
        exceptionDemo.nullPointerException(null);
        
        
    }
    @Test(expected = ClassNotFoundException.class)
    public void testClassNotFoundException()throws Exception{
        exceptionDemo.classNotFoundException();
    }
    
}
