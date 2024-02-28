
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public class ejercisio1 {
    public static void main(String[] args) {
        Scanner ñee = new Scanner(System.in);

        // Pedir dos números al usuario
        System.out.print("Introduzca el primer número: ");
        int num1 = ñee.nextInt();

        System.out.print("Introduzca el segundo número: ");
        int num2 = ñee.nextInt();

        // Comparar los dos números
        if (num1 > num2) {
            System.out.println("El primer número (" + num1 + ") es mayor que el segundo número (" + num2 + ").");
        } else if (num2 > num1) {
            System.out.println("El segundo número (" + num2 + ") es mayor que el primer número (" + num1 + ").");
        } else {
            System.out.println("Los dos números son iguales (" + num1 + ").");
        }
    }
    
}
