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
public class L4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the value n =");
        int n = input.nextInt();
        
        int sum=0, series=0;
        
        for(int i=1;i<=n;i++){
           sum+=i;
           series+=sum;
        }
        System.out.println("The sum of teh series = "+series);
        // TODO code application logic here
    }
    
}
