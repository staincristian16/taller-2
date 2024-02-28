/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

public class Punto3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo numero:");
        double numero2 = scanner.nextDouble();

        if (numero2 != 0) {
            double resultado = numero1 / numero2;
            System.out.println("El resultado de la division es: " + resultado);
        } else {
            System.out.println("Error: No se puede dividir por cero");
        }    
    }
    
    
    
    
    
}
