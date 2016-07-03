/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milan.week3.exception;

/**
 *
 * @author Meelon
 */
public class TryCatchFinallyDemo {

    public void tryBlock() {
        try {
            Double.valueOf("abc");
        } catch (Exception e) {

        }

    }

    public void tryCatchBlock() {
        try {
            Double.valueOf("--aa.77");
        } catch (NumberFormatException e) {
            e.printStackTrace();

            System.out.println(e.getCause());

            System.out.println(e.getMessage());
        }
    }

    public void multipleCatch() {
        try {
            Double.valueOf("10");
            Class.forName("A");
        } catch (NullPointerException n) {
            n.printStackTrace();
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        }
    }

    public void singleMultipleCatch() {
        try {
            Double.valueOf("10");
            Class.forName("A");
        } catch (NullPointerException | NumberFormatException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    public void finallyDemo(){
        try{
          Double.valueOf("10");
        }catch (NumberFormatException e)
        {
            e.printStackTrace();
        }
        finally{
            System.out.println("I am Final");
        }
         try{
          Double.valueOf("10.ab");
        }catch (NumberFormatException e)
        {
            e.printStackTrace();
        }
        finally{
            System.out.println("I am Final");
        }
    }

}
