/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuto4;

/**
 *
 * @author User10
 */
public class tuto4q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1=1, n2=1,n3,i;
        
        System.out.print(n1+" "+n2);
        
        for(i=2;i<10;i++){
            n3= n2+n1;
            System.out.print(" "+n3+" ");
            n1=n2;
            n2=n3;
        }
        // TODO code application logic here
    }
    
}
