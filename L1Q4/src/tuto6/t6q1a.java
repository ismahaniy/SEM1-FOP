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
public class t6q1a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand =  new Random();
        int num1=rand.nextInt(10);
        int num2=rand.nextInt(10);
        int num3=rand.nextInt(10);
        System.out.println(num1+","+num2+","+num3);
        System.out.println("the max number");
        System.out.println(max(num1,num2,num3));
        // TODO code application logic here
    }
    public static int max(int a,int b,int c){
        int max =a;
        if(b>max){
            max = b;
        }
        else if(c>max){
            max=c;
        }
        return max;
    }
}
