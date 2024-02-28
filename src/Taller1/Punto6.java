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
public class Punto6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        double num2 = scanner.nextDouble();
        System.out.println("Ingrese el tercer numero:");
        double num3 = scanner.nextDouble();
        
        double media = (num1 + num2 + num3) / 3;
        
        System.out.println("La media de los tres numeros es: " + media);
    }
    
}
