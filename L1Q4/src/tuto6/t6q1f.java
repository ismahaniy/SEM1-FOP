/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuto6;

import java.util.Random;

/**
 *
 * @author User10
 */
public class t6q1f {

    /**
     * @param args the command line arguments
     */
    static Random rand = new Random();
    static int[] num = new int[10];
    public static void main(String[] args) {
        random();
       
        // TODO code application logic here
    }
    public static void random(){
        for(int i=0;i<10;i++){
            num[i]=rand.nextInt(101);
            System.out.println(num[i]);
        }
        System.out.println();
    }
}
