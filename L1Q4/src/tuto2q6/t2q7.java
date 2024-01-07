/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuto2q6;
import java.util.Scanner;
/**
 *
 * @author User10
 */
public class t2q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float inch;
        System.out.println("Enter inch:");
        inch = input.nextFloat();
        
        float m = (float) (inch*2.54/100);
        System.out.println("" +inch + " inch = " +m + " meter");
        System.out.printf("%.2f inch = %.2f meter \n",inch, m);
           
        
    }  
        // TODO code application logic here
    
    
}
