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
public class AtmsystemError extends Error{
    public AtmsystemError(){
        super("Atm systemerror");
    }
    public AtmsystemError(String message){
        super(message);
    }
}
