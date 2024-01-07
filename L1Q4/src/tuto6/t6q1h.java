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
public class t6q1h {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        random();
        //System.out.println(random());
        // TODO code application logic here
    }
    public static int random(){
        Random rand = new Random();
        int []num= new int[11];
        int r;
        while(true){
            r=rand.nextInt(11);
            System.out.println(r);
            if(num[r]==1){
                return r;
            }
            else{
                num[r]=1;
            }
        }
    }
}
