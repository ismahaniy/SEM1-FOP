/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuto6;

/**
 *
 * @author User10
 */
public class t6q1g {

    /**
     * @param args the command line arguments
     */
    static double area,circle;
    public static void main(String[] args) {
        double r= 0.5;
        value(r);
        System.out.println(area);
        System.out.println(circle);
     // TODO code application logic here
    }
    public static void value(double r){
        area = Math.PI*(r*r);
        circle = Math.PI*2*r;
    }
}
