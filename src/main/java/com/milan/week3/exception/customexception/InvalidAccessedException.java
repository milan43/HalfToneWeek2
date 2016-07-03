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
public class InvalidAccessedException extends RuntimeException{
    public InvalidAccessedException(){
        super("invalid Accessed");
    }
    public InvalidAccessedException(String message){
        super(message);
    }
    
}
