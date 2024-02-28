/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

public class Punto5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        double numero = scanner.nextDouble();

        System.out.println("Ingrese un exponente:");
        int exponente = scanner.nextInt();

        if (exponente > 0) {
            double resultado = Math.pow(numero, exponente);
            System.out.println("El resultado es " + resultado + ".");
        } else if (exponente == 0) {
            System.out.println("El resultado es 1.");
        } else {
            double resultado = 1 / Math.pow(numero, -exponente);
            System.out.println("El resultado es " + resultado + ".");
        }
    }
}

