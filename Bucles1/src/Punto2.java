/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

public class Punto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El numero " + numero + " es impar.");
        }
        
    }
    
    
    
    
    
    
}
