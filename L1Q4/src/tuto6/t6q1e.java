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
public class t6q1e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s,num;
        System.out.println("Enter letter:");
        s = input.nextLine();
        //input.nextLine();
     // System.out.println("Enter the integer:");
       //num = input.nextLine();
        
        System.out.println("the number of letter: "+countLetter(s));
        

        // TODO code application logic here
    }
   public static int countLetter(String x){
       char[] ch=x.toCharArray();
       int letter = 0;
       for(int i=0;i<x.length();i++){
           if(Character.isLetter(ch[i])){
               letter++;
           }
       }
       return letter;
   } 
}
  
