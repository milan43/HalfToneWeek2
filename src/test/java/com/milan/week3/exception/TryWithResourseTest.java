/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milan.week3.exception;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Meelon
 */
public class TryWithResourseTest {
    private TryWithResourse tryWithResourse=new TryWithResourse();
    
    public TryWithResourseTest() {
    }

    @Test(expected = IOException.class)
    public void testTryWithResourse() throws Exception {
        tryWithResourse.tryWithResourse();
    }
    
}
