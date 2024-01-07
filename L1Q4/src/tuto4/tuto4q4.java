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
public class tuto4q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        String s = "November" , n="";
        char c;
        
        for(int i=0;i<s.length();i++){
            c = s.charAt(i);
            n=c+n;
        }
        System.out.println(n);
        
        // TODO code application logic here
    }
    
}
