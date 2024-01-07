/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lab4;
import java.util.Random;
/**
 *
 * @author User10
 */
public class L4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random input = new Random();
        int num = input.nextInt();
        System.out.println(""+num);
        String numString= Integer.toString(num);
        System.out.println(numString.length());
       
        // TODO code application logic here
    }
    
}
