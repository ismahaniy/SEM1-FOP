/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lab4;
import java.util.Random;
/**
 *
 * @author User10
 */
public class L4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random input = new Random();
        int player1Score, player2Score, sum1=0, sum2=0;
        
        System.out.println("Score player1 || Score player2 ");
        while(true){
           player1Score = input.nextInt(6)+1;
           if(player1Score==6){
            player1Score = input.nextInt(6)+1;   
           }
           // System.out.println("Score player1 = "+player1Score);
           sum1+=player1Score;
           player2Score = input.nextInt(6)+1;
           if(player2Score==6){
            player2Score = input.nextInt(6)+1;   
           }
           //System.out.println("Score player2 = "+player2Score);
           sum2+=player2Score;
           System.out.printf("%6s        || %6s",player1Score,player2Score);
           System.out.println("");
           if(sum1==100 || sum2==100){
               if(sum1>sum2){
                   System.out.println("PLAYER 1 WIN!!!");
               }
               else if(sum2>sum1){
                   System.out.println("PLAYER 2 WIN!!");
               }
               break;
           }
        }
        // TODO code application logic here
    }
    
}
