/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milan.week3.exception.customexception;

/**
 *
 * @author Meelon
 */
public class NotSufficientBalanceException extends Exception{
    public NotSufficientBalanceException(){
        super("No sufficient balance");
    }
    public NotSufficientBalanceException(String message){
        super(message);
    }
    
}
