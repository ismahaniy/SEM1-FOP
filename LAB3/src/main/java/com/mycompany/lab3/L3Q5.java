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
public class L3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Solve linear equation using Cramer's rule");
        System.out.println("First Equation => ax + by = e");
        System.out.println("Second Equation => cx + dy = f");
        int a,b,c,d,e,f,eq;
        float x,y;
        System.out.println("Enter the value of:");
        System.out.println("a=");
        a = input.nextInt();
        System.out.println("b=");
        b = input.nextInt();
        System.out.println("c=");
        c = input.nextInt();
        System.out.println("d=");
        d = input.nextInt();
        System.out.println("e=");
        e = input.nextInt();
        System.out.println("f=");
        f = input.nextInt();
        
        eq= (a*d)-(b*c);
        
        if(eq==0){
            System.out.println("THE EQUATION HAS NO SOLUTION");
        }
        else{
            x = ((e*d)-(b*f))/((a*d)-(b*c));
            y = ((a*f)-(e*c))/((a*d)-(b*c));
            System.out.println("x = "+x);
            System.out.println("y = "+y);
        }
        
        
        
        // TODO code application logic here
    }
    
}
