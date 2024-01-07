/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lab4;

import java.util.Scanner;

/**
 *
 * @author User10
 */
public class L4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double monthlyPayment, principalAmaount,principal, interest ,interestMonth, unpaidBalance, totalInterest=0,pow;
        double totalMonth;
        int currentMonth;
        
        System.out.print("Enter Principle Amount: ");
        principalAmaount = input.nextDouble();
        System.out.print("Enter interest in %:");
        interest = input.nextDouble();
        System.out.print("Enter total number of months:");
        totalMonth = input.nextDouble();
        
        monthlyPayment= (principalAmaount * interest / (12 * 100)) / (1 - Math.pow(1 + interest / (12 * 100), -totalMonth));
        
        System.out.printf("%-16s%16s%16s%16s%20s%20s","Month","Monthly Payment","Principal","Interest","Unpaid Balance","Total Interest");
        System.out.println();
        for(currentMonth=1; currentMonth<=totalMonth; currentMonth++){
           principal = monthlyPayment*Math.pow(1+interest/(12*100),-(1+totalMonth-currentMonth));
           interestMonth = monthlyPayment - principal ;
           unpaidBalance = (interestMonth/(interest/12*100))-principal;
           totalInterest += interestMonth;
           
            System.out.printf("%-16d%16.2f%16.2f%16.2f%20.2f%20.2f",currentMonth,monthlyPayment,principal,interestMonth,unpaidBalance,totalInterest);
            System.out.println();
            //System.out.printf("%d%.2f%.2f%.2f%.2f%.2f",currentMonth,monthlyPayment,principal,interestMonth,unpaidBalance,totalInterest);
        }
        
        // TODO code application logic here
    }
    
}
