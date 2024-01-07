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
public class t2q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         float d;  
        System.out.print("Please enter the diameter of circle: " ); 
        d = input.nextFloat();
        /* Using Math class  */  
        float r = d/2;
      
        double cir = 2*(Math.PI*r);  
        System.out.printf("Circumference of circle is: %.3f \n", cir );  
    }  
}  
        
        
        
        // TODO code application logic here
    
    

