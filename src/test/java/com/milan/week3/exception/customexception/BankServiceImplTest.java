/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milan.week3.exception.customexception;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Meelon
 */
public class BankServiceImplTest {
    BankService b = new BankServiceImpl();
    public BankServiceImplTest() {
    }

    @Test
    public void testDoPayment() throws Exception {
        b.doPayment(10.0, 12.0);
    }

    @Test
    public void testDoWithdraw() throws Exception {
        b.doWithdraw(70d, 30d);
    }
    
}
