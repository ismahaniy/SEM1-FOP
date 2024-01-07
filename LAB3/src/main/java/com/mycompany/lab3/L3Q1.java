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
public class L3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first integer:");
        int int1 = input.nextInt();
        System.out.println("Enter second integer:");
        int int2 = input.nextInt();
        //System.out.println("Enter the operand:");
        //String Name = input.nextLine(); 
        
        System.out.println("enter the operand :");
        char operand = input.next().charAt(0);
        
        if(operand=='+'){
            System.out.println("the sum of integer = "+(int1 +int2));
        }
        else if(operand == '-'){
            System.out.println("the different of integer = "+(int1-int2));
        }
        else if(operand == '*'){
            System.out.println("the multiple of integer = "+(int1*int2));
        }
        else if(operand == '/'){
            System.out.println("the devider of integer= ");
            System.out.print((double) int1/int2);
        }
        else if(operand == '%'){
            System.out.println("the reminder of integer=");
            System.out.print( (double) int1%int2);
        }
        
        
        //System.out.println(""+int1);
        //System.out.println(""+int2);
        //System.out.println(""+Name);
        
     
        // TODO code application logic here
    }
    
}
