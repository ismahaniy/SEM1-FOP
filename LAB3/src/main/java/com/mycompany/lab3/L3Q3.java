/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lab3;
import java.util.Scanner;
/**
 *
 * @author User10
 */
public class L3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your sales volume :");
        float salesVolume = input.nextFloat();
        
        if (salesVolume>1000){
            System.out.println("Your commission is 12.5% of total sales");
            double commission;
            commission = (12.5*salesVolume)/100;
            System.out.printf("Your commission is =%.2f",commission);
        }
        else if (salesVolume<=1000&&salesVolume>500){
            System.out.println("Your commission is 10% of total sales");
            double commission;
            commission = (10*salesVolume)/100;
            System.out.printf("Your commission is =%.2f",commission); 
        } 
        else if (salesVolume<=500&&salesVolume>100){
            System.out.println("Your commission is 7.5% of total sales");
            double commission;
            commission = (7.5*salesVolume)/100;
            System.out.printf("Your commission is =%.2f",commission); 
        }    
        else if (salesVolume<=100){
            System.out.println("Your commission is 5% of total sales");
            double commission;
            commission = (5*salesVolume)/100;
            System.out.printf("Your commission is =%.2f",commission); 
        }
            
        
        // TODO code application logic here
    }
    
}
