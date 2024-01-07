/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lab3;
import java.util.Random;
/**
 *
 * @author User10
 */
public class L3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random input = new Random();
        
        System.out.println("LETS PLAY DICE GAME");
        int dice1, dice2,dice3,dice4;
        dice1 = input.nextInt(6)+1;
        dice2 = input.nextInt(6)+1;
        dice3 = input.nextInt(6)+1;
        dice4 = input.nextInt(6)+1;
        
        System.out.println("Player 1:\nFirst roll = "+dice1+"\nSecond roll = "+dice2);
        System.out.println("Player 2:\nFirst roll = "+dice3+"\nSecond roll = "+dice4);
        
        int player1,player2;
        player1= dice1 + dice2;
        player2= dice3 + dice4;
        
        if(player1>player2){
            System.out.println("PLAYER 1 WIN");
        }
        else if(player2>player1){
            System.out.println("PLAYER 2 WIN");
        }
        else if (player1==player2){
            System.out.println("DRAW");
        }
            
        
        
       
        
        // TODO code application logic here
    }
    
}
