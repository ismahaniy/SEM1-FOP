/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lab4;
import java.util.Scanner;
/**
 *
 * @author User10
 */
public class L4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, day, year;
        System.out.println("0 = Sunday");
        System.out.println("1 = Monday");
        System.out.println("2 = Tuesday");
        System.out.println("3 = Wednesday");
        System.out.println("4 = Thursday");
        System.out.println("5 = Friday");
        System.out.println("6 = Saturday");
        
        System.out.print("Enter the year :");
        year = input.nextInt();
        System.out.print("First day of the year:");
        day = input.nextInt();
        
        int dayBeforeMay=120, dayBeforeAugust=dayBeforeMay+92;
        
        if((year%4==0)&&(year%100!=0) || (year%400==0)){
          dayBeforeMay++;
          dayBeforeAugust++;
        }
        //firstday
        int firstDayMay=(day + dayBeforeMay)%7;
        int firstDayAugust=(day + dayBeforeAugust)%7;
        
        System.out.println("MAY");
        System.out.printf("%5s%5s%5s%5s%5s%5s%5s","Sun","Mon","Tue","Wed","Thu","Fri","Sut");
        System.out.println("");
        for(int i=0;i<firstDayMay;i++){
            System.out.printf("%5s","");
            
        }
        for(int i=1;i<=31;i++){
            System.out.printf("%5s",i);
            if((i+firstDayMay) %7==0 ){
                System.out.println("");
            }
        }
        System.out.println();
        System.out.println("AUGUST");
        System.out.printf("%5s%5s%5s%5s%5s%5s%5s","Sun","Mon","Tue","Wed","Thu","Fri","Sut");
        System.out.println("");
        for(int i=0;i<firstDayAugust;i++){
            System.out.printf("%5s","");
            
        }
        for(int i=1;i<=31;i++){
            System.out.printf("%5s",i);
            if((i+firstDayAugust) %7==0 ){
                System.out.println("");
            }
        }
        
        
        // TODO code application logic here
    }
    
}
