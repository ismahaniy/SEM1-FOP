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
public class L2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Convert seconds to hour and minutes");
        float tsec, hour, min, sec;
        System.out.println("Enter seconds:");
        tsec = input.nextFloat();
        hour = tsec/3600;
        min = (tsec%3600)/60;
        sec = tsec%60;
        
        System.out.printf("%.0f hours %.0f minutes %.0f seconds", hour,min,sec);
        
        
        
        
        
        // TODO code application logic here
    }
    
}
