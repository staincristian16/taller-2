
package Taller1;

import java.util.Scanner;

public class punto13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            double numero = scanner.nextDouble();

            if (numero < 0) {
                System.out.println("Por favor, ingrese un número no negativo.");
            } else {
                double raizCuadrada = Math.sqrt(numero);
                double raizCubica = Math.cbrt(numero);

                System.out.println("Raíz cuadrada de " + numero + ": " + raizCuadrada);
                System.out.println("Raíz cúbica de " + numero + ": " + raizCubica);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor, ingrese un número válido.");
        } finally {
            scanner.close();
        }
    }
}