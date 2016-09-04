/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tri;

import java.util.Scanner;

/**
 *
 * @author Anastasiia
 */
public class TRI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Введите катет");
        Scanner sn = new Scanner (System.in);
        double a=sn.nextDouble();
        System.out.println("Введите прилежащий угол");
        double c=sn.nextDouble();
    double tan;
    tan= Math.tan(Math.toRadians(c));
    double S;
    S= a*a*tan/2;
        System.out.println("Площадь равна: " + S+" кв.ед.");
    }
    
}
