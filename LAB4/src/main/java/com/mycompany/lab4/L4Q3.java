/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lab4;
import java.util.Scanner;
/**
 *
 * @author User10
 */
public class L4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score, num=0 ,sum=0;
        int minscore = Integer.MAX_VALUE;
        int maxscore = Integer.MIN_VALUE;
        double sd, avg, sumDouble=0 ;
        
        System.out.print("Enter a score {negative score to quit :");
        while((score = input.nextInt())!=-1){
            if (score<0){
                break;
            }
        //determine the min
        minscore = Math.min(minscore,score);
        //determine the max
        maxscore = Math.max(maxscore,score);
        //determine sum
        sum += score;
        sumDouble+=(score*score);
        num ++;
        System.out.print("Enter a score {negative score to quit :");    
        }
       
       avg = (double)sum/num;
       sd = Math.sqrt((sumDouble-(double)sum*sum/num)/num-1);
       
        System.out.println("Minimum number :"+minscore);
        System.out.println("Maximum number :"+maxscore);
        System.out.println("Average score :"+avg);
        System.out.printf("Standard deviation : %.2f ",sd);
       
       
       
       
        // TODO code application logic here
    }
    
}
