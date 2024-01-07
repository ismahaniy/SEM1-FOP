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
public class L2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float fah;
        System.out.println("Converter Fahrenheit degree to degree celcius");
        System.out.println("Enter the Fahrenheit:");
        fah = input.nextFloat();
       float cel = (float) ((fah-32)/1.8);
       
        System.out.printf("%.2f Fahrenheit degree = %.2f degree celcius",fah,cel);
        // TODO code application logic here
    }
    
}
