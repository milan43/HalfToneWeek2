/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milan.week3.exception.customexception;

import static org.testng.Assert.*;

/**
 *
 * @author Meelon
 */
public class BankServiceNGTest {
    
    public BankServiceNGTest() {
    }

    @org.testng.annotations.Test
    public void testDoPayment() throws Exception {
    }

    @org.testng.annotations.Test
    public void testDoWithdraw() throws Exception {
    }

    public class BankServiceImpl implements BankService {

        public void doPayment(Double custPayment, Double actualPayment) throws NotSufficientBalanceException {
        }

        public void doWithdraw(Double withdrawAmount, Double balance) throws NotSufficientBalanceException, DailyAmountExceedMoney {
        }
    }
    
}
