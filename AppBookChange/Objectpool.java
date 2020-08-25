/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
public class Objectpool {
    
    private static  Objectpool instance;
    
    private ArrayList<Book> a = new ArrayList<Book>();
    private int countq;
    public static Objectpool getInstance() {
        if (instance == null)
            instance = new Objectpool();
        return instance;
    }
    
    public void get(Book user){
    	
    	countq = 10;
        for(int i = 0; i<countq;i++){
            a.add(i,user.clone()) ;
                 }
            
    }
  
    public void release(){
    	Scanner sc = new Scanner(System.in);
    	
    	int count = countq;
    	System.out.format("Now we have book : %d", countq);	
    	System.out.println(  );
    	
    	System.out.println(" You want to borror or return?  borrow or return: ");
    	String text = sc.nextLine();
        
    	if (text.equals("borrow")) {
    	System.out.println("How many books would you like to borrow?: ");
    	
    	int num = sc.nextInt();
    	
    	if (num > 0 && num <= 10){
                
                
                if (count > 0 ) {
    			
    			
                        int x = count-num;
                        
                        if(x <  0) {
                            
                            System.out.println("can not borrow !");
                            
        	
    			}
                        
                        else {
                        count =count-num;
    			for(int i = 0; i<count;i++){
    			
    				Book test = a.get(i);
    				System.out.println(test.getFistName());
    				
    				}
    			countq = count;
    			}}
    		
    		else if(count ==  0) {
        	
    				System.out.println("can not borrow !");
        	
    			}
    		else {System.out.println("You made a mistake !! Please try again");}}
        else { System.out.println("The number must not be negative and must not exceed 10."); }
        	release();
    	} 
        
    	else if (text.equals("return")) {
    		if(count < 10 && count >= 0) {
                        System.out.println("How many books would you like to return?: ");
        	
                        int num = sc.nextInt();
                
                        if (num > 0 && num <= 10){
                             int y = count+num;
                               if (y > 10){
                                System.out.println("can not return !");
                               }
                               
                               else{
                            count =count+num;

                            for(int i = 0; i<count;i++){

                                    Book test = a.get(i);
                                    System.out.println(test.getFistName());}
                                    countq = count;
                                    }}
                        else {
                            num = 0;
                            System.out.println("can not return !");}
                        
                        
                }


    		else {System.out.println("You made a mistake !! Please try again");
        	release();}       
    	}
        
    	else {System.out.println("You made a mistake !! Please try again");
    	release();}
    		release();	
    }
    }
 
     
    
    
    
    
    
   

