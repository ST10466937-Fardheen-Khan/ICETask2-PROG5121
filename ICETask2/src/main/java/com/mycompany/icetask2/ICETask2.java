package com.mycompany.icetask2;

import java.util.Scanner;
        
public class ICETask2 {

    public static void main(String[] args) {
        String name , surname;// initializing variables 
        int age; // initializing variables
        Scanner a = new Scanner(System.in);// start a scanner to check inputs 
        
        System.out.println("Please enter your first name");
        name = a.next();// Space is left for details of user
        
        System.out.println("Please enter your surname");
        surname = a.next();// Space is left for details of user 
        
        System.out.println("Please enter your age");
        age = a.nextInt(); // Space is left for details of user
        
        Checkidentity(name, surname,age);//this is to call the method
    } 
    public static boolean Checkidentity(String inA, String inB, int inC){
        
        boolean check;// start a boolean
        
        if (inA.equals("Jack") && inB.equals("Khoza") && inC == 25){
        
            check = true;//if the details match 
            System.out.println("This is Jack");// output if details are true 
            
        }
        else// else if the details are not true  
            
        {
            check = false;// if the details are false 
            System.out.println("This is not Jack");// output if details are false
        }
            
        { 
        return check;// returning check 
            
        }   
        
        }
    }