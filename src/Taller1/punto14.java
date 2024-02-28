
package Taller1;

import java.util.Scanner;

import java.util.Scanner;

public class punto14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número de dos cifras: ");
            int numero = scanner.nextInt();

            if (numero >= 10 && numero <= 99) {
                int cifra1 = numero % 10;
                int cifra2 = numero / 10;

                int numeroInvertido = cifra1 * 10 + cifra2;

                System.out.println("Número invertido: " + numeroInvertido);
            } else {
                System.out.println("Por favor, ingrese un número de dos cifras.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor, ingrese un número válido.");
        } finally {
            scanner.close();
        }
    }
}
