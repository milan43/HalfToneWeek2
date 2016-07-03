/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milan.week3.exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Meelon
 */
public class TryWithResourse {

    //try with resourse --Cl0seable or AutoCloseable

    public void tryWithResourse() throws IOException {
        try (InputStream inputStream = new FileInputStream("C:\\Users\\Meelon\\Documents\\NetBeansProjects\\hello.txt.txt")) {
            int read;
            while (((read = inputStream.read()) != -1)) {
                System.out.println(read + " ");
            }
        }

    }

}
