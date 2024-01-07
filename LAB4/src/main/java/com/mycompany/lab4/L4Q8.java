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
public class L4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(101);
        System.out.println("Generated Number: " + num);

        //Checking every number whether it's prime from 1 to the number
        int count = 0;
        for (int i = 2; count < num; i++) {
            //Check whether it '2' (exception)
            if (i == 2) {
                System.out.println(i);
                count++;
                continue;
            }

            //Check even first
            if (i % 2 == 0) {
                continue;
            }
            //Check whether its divisible by all odd number upto the
            //number 'i'

            boolean isPrime = true;

            for (int j = 3; j < i; j += 2) {
                //If its not, set isPrime to false;
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                System.out.println(i);
            }
        }

        //Sieve of Eratosthenes
    }
}
