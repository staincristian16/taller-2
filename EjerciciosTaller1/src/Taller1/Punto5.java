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
public class Punto5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Fahrenheit:");
        double fahrenheit = scanner.nextDouble();
        
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        
        System.out.println("La temperatura en grados Celsius es: " + celsius);
    }
    
}
