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
public class t6q1d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numPent;
        System.out.println("Enter pentagonal number:");
        numPent = input.nextInt();
        if(pent(numPent)==true){
            System.out.println("correct");
        }
        else if(pent(numPent)==false){
            System.out.println("incorrect");
        }
        // TODO code application logic here
    }
    public static boolean pent(int p){
        int i=1,s;
        do{
            s=((3*i*i-i)/2);
            i+=1;
        }while (s<p);
      if(s==p){
          return true;
      }
      else{
          return false;
      }
    }
    
}
