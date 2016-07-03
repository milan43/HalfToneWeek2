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
public class ExceptionDemo {

    public void nullPointerException(Student student) {
        System.out.println("name=" + student.getName());
    }

    void classNotFoundException() throws ClassNotFoundException {
        Class.forName("IAmDon");
    }

}

class Student {

    private final String name = "RAM";

    public String getName() {
        return name;
    }
}
