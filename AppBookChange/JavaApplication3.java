/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author LAB304_20
 */
public class JavaApplication3 {
    
       
    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        
        Book userData = new Book();
       
        userData.setFistName("Book");  
        Objectpool test = new Objectpool();
        test.get(userData);
        test.release();
        
    }
    
   
}
