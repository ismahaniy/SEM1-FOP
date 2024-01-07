/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuto3;
import java.util.Scanner;
/**
 *
 * @author User10
 */
public class tuto3q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Determine leap year");
        System.out.println("Enter year");
        int year = input.nextInt();
        
        if((year%4==0)&&(year%100!=0) || (year%400==0)){
            System.out.println(""+year+" is the leap year");
        }
        else
            System.out.println(""+year+ " is not a leap year");
        // TODO code application logic here
        
    }
    
}
