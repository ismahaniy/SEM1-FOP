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
public class L3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter the radius of the circle:");
        float radius = input.nextFloat();
        System.out.println("Enter coordinates x:");
        float x = input.nextFloat();
        System.out.println("Enter coordinates y:");
        float y = input.nextFloat();
        
        double distance = Math.sqrt(x*x+y*y);
        
        if(distance<radius){
            System.out.printf("The coordinates (%.1f , %.1f) is inside the circle",x,y);
        }
        else{
            System.out.printf("\nThe coordinates (%.1f , %.1f) is not inside the circle",x,y);
        }
        
            
        
        // TODO code application logic here
    }
    
}
