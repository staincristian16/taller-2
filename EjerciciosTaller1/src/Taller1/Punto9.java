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
public class Punto9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el total de la compra:");
        double totalCompra = scanner.nextDouble();
        
        double descuento = totalCompra * 0.15;
        double totalPagar = totalCompra - descuento;
        
        System.out.println("El total a pagar despues del descuento es: " + totalPagar);
    }
    
}
