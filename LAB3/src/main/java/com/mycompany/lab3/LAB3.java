/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab3;
import java.util.Scanner;
/**
 *
 * @author User10
 */
public class LAB3 {

    public static void main(String[] args) {
         Scanner myObj = new Scanner(System.in);
         String userName;
    
    // Enter username and press Enter
    System.out.println("Enter username"); 
    userName = myObj.nextLine();   
       
    System.out.println("username:" + userName);
    System.out.println(userName.charAt(0));
    }
}
