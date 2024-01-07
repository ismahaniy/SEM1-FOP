/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuto6;

import java.util.Scanner;

/**
 *
 * @author User10
 */
public class t6q1b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter square number:");
        num = input.nextInt();
        
        if(sqrt(num)){
        System.out.println(sqrt(num));
        }
        else{
            System.out.println(num+" not a square number");
        }
        // TODO code application logic here
    }
    public static boolean sqrt(int x){
        double s=Math.sqrt(x);
        return s-Math.floor(s)==0;
    }
}
