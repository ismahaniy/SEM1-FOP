/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lab2;
import java.util.Scanner;

/**
 *
 * @author User10
 */
public class L2Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the ammount of water in gram :");
        double water = input.nextFloat();
        
        //we can straight calculate the temperature in celcius
        System.out.println("Enter the initial temperature in Fahrenheit :");
        double initialtemp = (input.nextDouble() - 32) / 1.8;
        System.out.println("Enter the the final temperature in Fahrenheit :");
        double finaltemp = (input.nextDouble() -32)/1.8;
        
        double energy = water*(finaltemp - initialtemp)*4184;
        
        System.out.println("The energy needed :"+ energy);
        
        
        
        // TODO code application logic here
    }
    
}
