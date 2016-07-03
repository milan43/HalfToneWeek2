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
public class DailyAmountExceedMoney extends Exception{
    public DailyAmountExceedMoney(){
        super("daily exceed amount");
    }
    public DailyAmountExceedMoney(String message){
        super(message);
    }
    
}
