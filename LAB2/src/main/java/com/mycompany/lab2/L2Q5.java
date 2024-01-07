/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lab2;
import java.util.Random;

/**
 *
 * @author User10
 */
public class L2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random input = new Random();
         int num1;
         num1 = input.nextInt(1000);
         
         System.out.println("the random number = "+ num1);
         int sum= 0;
         while (num1>0){
            sum += (num1)%(10);
            
            num1/= 10;
            
                     
         }
         
         System.out.println("The sum of all digit in the number ="+ sum);
         
         
         
        
        // TODO code application logic here
    }
    
}
