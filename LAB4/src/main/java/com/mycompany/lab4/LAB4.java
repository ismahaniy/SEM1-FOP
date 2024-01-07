/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab4;
import java.util.Scanner;

/**
 *
 * @author User10
 */
public class LAB4 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int []array = new int[100];
        
        for(int i=0;i<array.length;i++){
            System.out.print("Enter a score [negative score to quit]:");
            array[i]=input.nextInt();
            if(array[i]<0){
                break;
            }
           
    }
        for(int i=0;i<array.length;i++){
            if(array[i]>array[i+1]){
                int max = array[i];
                System.out.println("Maximum score = "+max);
                break;
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i+1]<array[i]){
                int min = array[i+1];
            if(min<0){
                min = array[i];
            }
                System.out.println("Minimum score = "+min);
                break;
            }
        }
        int sum = 0;
        for(int i=0;i<array.length;i++){
            
            sum+= array[i];
            
        }
        
        System.out.println(+sum);
    }
}
