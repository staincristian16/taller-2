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
public class Punto8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el sueldo base:");
        double sueldoBase = scanner.nextDouble();
        System.out.println("Ingrese el valor de la primera venta:");
        double venta1 = scanner.nextDouble();
        System.out.println("Ingrese el valor de la segunda venta:");
        double venta2 = scanner.nextDouble();
        System.out.println("Ingrese el valor de la tercera venta:");
        double venta3 = scanner.nextDouble();
        
        double comisiones = (venta1 + venta2 + venta3) * 0.10;
        double sueldoTotal = sueldoBase + comisiones;
        
        System.out.println("El total por concepto de comisiones es: " + comisiones);
        System.out.println("El sueldo total que recibira en el mes es: " + sueldoTotal);
    }
    
}
