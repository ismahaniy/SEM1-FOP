/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuto4;
import java.util.Scanner;
/**
 *
 * @author User10
 */
public class tuto4q1d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number :");
        int n = input.nextInt();
        int sum=0;
        for (int m=1;m<=n;m++){
           
           sum+=m;
        }
        System.out.println("Sum of the number from 1 to a given number = " +sum );
        // TODO code application logic here
    }
    
}
