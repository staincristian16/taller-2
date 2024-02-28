/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Punto3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer cateto:");
        double cateto1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo cateto:");
        double cateto2 = scanner.nextDouble();
        
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        
        System.out.println("La hipotenusa del triangulo rectangulo es: " + hipotenusa);
    }
    
}
