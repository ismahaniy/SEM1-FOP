/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuto7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author User10
 */
public class t7q1a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        
        try{
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("integer.txt"));
            
            for(int i=0;i<10;i++){
                outputStream.println(rand.nextInt(101));
            }
            
            outputStream.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
        // TODO code application logic here
    }
    
}
