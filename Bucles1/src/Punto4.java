/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

public class Punto4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cadena:");
        String cadena = scanner.nextLine();

        if (cadena.length() == 1 && Character.isUpperCase(cadena.charAt(0))) {
            System.out.println("La cadena es una letra mayuscula.");
        } else {
            System.out.println("La cadena no es una letra mayuscula.");
        }
    }
    
    
}

