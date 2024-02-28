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
public class Punto7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos:");
        int minutosTotales = scanner.nextInt();
        
        int horas = minutosTotales / 60;
        int minutos = minutosTotales % 60;
        
        System.out.println("La cantidad de minutos ingresada equivale a: " + horas + " horas y " + minutos + " minutos.");
    }
    
}
