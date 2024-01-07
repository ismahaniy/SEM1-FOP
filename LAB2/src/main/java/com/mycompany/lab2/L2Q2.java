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
public class L2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We will calculate the monthly payment for car loan");
        System.out.println("Fullfill the information");
        float p,d,r,y,m;
        System.out.println("The price of the car:");
        p = input.nextFloat();
        System.out.println("Down payment:");
        d = input.nextFloat();
        System.out.println("Interest rate in %:");
        r = input.nextFloat();
        System.out.println("Loan duration in year:");
        y = input.nextFloat();
        
        m =(p-d)*(1+r*y/100)/(y*12);
        
        System.out.printf("The monthly payment: %.2f",m);       
        // TODO code application logic here
    }
    
}
