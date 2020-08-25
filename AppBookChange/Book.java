/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LAB304_20
 */


public class  Book {

    private String fistName ;
   
    public String getFistName() {
        return fistName;
    }


    public void setFistName(String fistName) {
        this.fistName = fistName;
    }
    public Book clone(){
         Book I = new Book();
         I.fistName = this.fistName;
        return I;
            
        
        }

    /**
     * @return the count
     */
    public int getCount() {
        return 0;
    }
    }
    

