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
public class tuto3q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int int1, int2,int3;
        System.out.println("Enter three integer:");
        int1 = input.nextInt();
        int2 = input.nextInt();
        int3 = input.nextInt();
        
        if(int1>int2){
            if(int1>3)
                System.out.println(""+int1+" is the biggest number");
        }
        else if (int2>int1){
            if(int2>int3)
                System.out.println(""+int2+" is the biggest number");
        }
        else if (int3>int1){
            if(int3>int2)
                System.out.println(""+int3+" is the biggest number");
        }
        
        // TODO code application logic here
    }
    
}
