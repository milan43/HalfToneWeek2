/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milan.week3.exception.customexception;

import java.util.Random;

/**
 *
 * @author Meelon
 */
public class BankServiceImpl implements BankService {

    Random random = new Random(100);

    public boolean isLoginAndAtmAvailable() {
        return random.nextInt(100) % 2 == 0;
    }

    @Override
    public void doPayment(Double custPayment, Double actualPayment) throws NotSufficientBalanceException {

        if (custPayment == null || actualPayment == null) {
            throw new IllegalArgumentException("Invalid Amount.{custPayment="
                    + custPayment + ",actualPayment=" + actualPayment + "}"
            );
        }
        if (isLoginAndAtmAvailable()) {
            throw new InvalidAccessedException();
        }
        if (custPayment > actualPayment) {
            throw new NotSufficientBalanceException();
        }
        if (isLoginAndAtmAvailable()) {
            throw new AtmsystemError();
        }

    }

    @Override
    public void doWithdraw(Double withdrawAmount, Double balance)
            throws NotSufficientBalanceException, DailyAmountExceedMoney {

        if (isLoginAndAtmAvailable()) {
            throw new InvalidAccessedException();
        }
        if (withdrawAmount == null || balance == null) {
            throw new IllegalArgumentException("Invalid Amount,"
                    + "[withdraw=" + withdrawAmount
                    + ",balance=" + balance + "}"
            );
        }
        if (withdrawAmount > 30000) {
            throw new DailyAmountExceedMoney();
        }
        if (withdrawAmount > balance) {
            throw new NotSufficientBalanceException();
        }
        if(isLoginAndAtmAvailable()){
            throw new AtmsystemError();
        }
    }

}

interface BankService {

    /**
     *
     * @param custPayment
     * @param actualPayment
     * @throws NotSufficientBalanceException
     */
    void doPayment(Double custPayment, Double actualPayment)
            throws NotSufficientBalanceException;

    void doWithdraw(Double withdrawAmount, Double balance)
            throws NotSufficientBalanceException, DailyAmountExceedMoney;
}
