/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuto4;

/**
 *
 * @author User10
 */
public class tuto4q1e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n,m;
        float sum=0;
        
       // m=1;
        n=25;
        m=1;
        
        while(n>0){
            sum = sum + (m/n);
            System.out.println(m+"/"+n+"="+sum);
            m++;
            n--;
            
        }
            System.out.printf("\n the sum of the series = %.2f ",sum);
        
        // TODO code application logic here
    }
    
}
