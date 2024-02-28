
package Taller1;

import java.util.Scanner;

public class Punto12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la coordenada x del primer punto: ");
        double x1 = scanner.nextDouble();

        System.out.print("Ingrese la coordenada y del primer punto: ");
        double y1 = scanner.nextDouble();

        System.out.print("Ingrese la coordenada x del segundo punto: ");
        double x2 = scanner.nextDouble();

        System.out.print("Ingrese la coordenada y del segundo punto: ");
        double y2 = scanner.nextDouble();

        double distancia = calcularDistancia(x1, y1, x2, y2);

        System.out.println("La distancia entre los puntos (" + x1 + ", " + y1 + ") y (" + x2 + ", " + y2 + ") es: " + distancia);
    }

    // Función para calcular la distancia entre dos puntos
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
