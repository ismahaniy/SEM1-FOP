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
public class L4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int num = input.nextInt();
        
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println("The factor of the number = "+i);
            }
        }
        
        // TODO code application logic here
    }
    
}
