/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lab3;
import java.util.Random;
/**
 *
 * @author User10
 */
public class L3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random input = new Random();
        
        int num1;
        num1 = input.nextInt(6);
        //System.out.println(""+num1);
        
        switch (num1) {
            case 0 -> System.out.println(""+num1+ " is zero");
            case 1 -> System.out.println(""+num1+ " is one");
            case 2 -> System.out.println(""+num1+ " is two");
            case 3 -> System.out.println(""+num1+ " is three");
            case 4 -> System.out.println(""+num1+ " is four");
            case 5 -> System.out.println(""+num1+ " is five");
            // TODO code application logic here
            default -> {
            }
        }
    }
    
}
