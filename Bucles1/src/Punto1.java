

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

public class Punto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero:");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("El primer numero (" + numero1 + ") es mayor que el segundo numero (" + numero2 + ")");
        } else if (numero1 < numero2) {
            System.out.println("El segundo numero (" + numero2 + ") es mayor que el primer numero (" + numero1 + ")");
        } else {
            System.out.println("Ambos números son iguales.");
        }
        
    }
    
    
    
    
    
}

