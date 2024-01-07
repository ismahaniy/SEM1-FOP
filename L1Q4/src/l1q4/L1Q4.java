/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l1q4;
import java.util.Scanner;
/**
 *
 * @author User10
 */

public class L1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float mark;
        System.out.println("Please enter your mark:");
        mark = input.nextInt();
        
        if (mark >= 80)
            System.out.println("Your grade is A");
        else if (mark >= 75)
            System.out.println("Your grade is A-");
        else if (mark >= 70)
            System.out.println("Your grade is B+");
        else if (mark >= 65)
            System.out.println("Your grade is B");
        else
            System.out.println("You are failed");
        
        
      
        
        
        
        // TODO code application logic here
    }
    
}
