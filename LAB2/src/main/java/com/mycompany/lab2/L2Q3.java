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
public class L2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random input = new Random();
        
        int num1, num2, num3;
        num1 = input.nextInt(41)+10;
        num2 = input.nextInt(41)+10;
        num3 = input.nextInt(41)+10;
        
        System.out.println("number 1=" + num1 + "\nnumber 2=" + num2 + "\nnumber 3=" + num3);
        float sum = num1 + num2 + num3; 
        System.out.println("Sum of the numbers ="+ sum);
        float avg = sum/3;
        System.out.printf("Average of the numbers = %.2f", avg);
        
        
        
        // TODO code application logic here
    }
    
}
