/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuto5;

import java.util.Random;

/**
 *
 * @author User10
 */
public class t5q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        
        int num= rand.nextInt(256);
        System.out.print("The random number = "+num);
        System.out.println();
        
        String bin = Integer.toBinaryString(num);
        String[] binNum = bin.split(" ");
        
        for(int i=0;i<binNum.length;i++){
            System.out.print(binNum[i]);
        }
        
        System.out.println();
        // TODO code application logic here
    }
    
}
