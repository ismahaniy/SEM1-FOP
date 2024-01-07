/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuto5;

import java.util.Scanner;

/**
 *
 * @author User10
 */
public class t5q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        
        System.out.println("Enter the sentences:");
        String ayat = input.nextLine();
        
        String []ayatReverse = ayat.split(" ");
        
        for(int i=ayatReverse.length-1;i>=0;i--){
            System.out.print(ayatReverse[i]+" ");
            
        }
        System.out.println();
        // TODO code application logic here
    }
    
}
