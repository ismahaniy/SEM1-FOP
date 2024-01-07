/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuto6;

/**
 *
 * @author User10
 */
public class t6q1c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(nCr(5,2));
        // TODO code application logic here
    }
    public static int nCr(int n,int r){
        return fact(n)/fact(r)*fact(n-r);
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
         int r=1;
        for(int i=2;i<=n;i++){
            r=r*i;
        }
        return r;
        }
        
    }
}



