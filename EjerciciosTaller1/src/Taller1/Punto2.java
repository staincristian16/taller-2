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
public class Punto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del rectangulo:");
        double altura = scanner.nextDouble();
        
        double perimetro = 2 * (base + altura);
        double area = base * altura;
        
        System.out.println("El perímetro del rectangulo es: " + perimetro);
        System.out.println("El area del rectangulo es: " + area);
    }
    
}
