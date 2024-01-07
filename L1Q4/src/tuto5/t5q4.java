/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuto5;

import java.util.Scanner;

/**
 *
 * @author User10
 */
public class t5q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String keyword = "the";
        int w=0;
        
        System.out.println("Enter the sentences:");
        String sentences = input.nextLine();
        
        String []newSentences = sentences.split(" ");
        
        for(int i=0;i<newSentences.length;i++){
            if(newSentences[i].equals(keyword)){
                w++;
            }
        }
        System.out.println("the number of 'the' = "+w);
        // TODO code application logic here
    }
    
}
