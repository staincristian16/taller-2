
package Taller1;


import java.util.Scanner;

public class Punto11{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double distancia = Math.abs(numero1 - numero2);

        System.out.println("La distancia entre " + numero1 + " y " + numero2 + " es: " + distancia);
    }
}
