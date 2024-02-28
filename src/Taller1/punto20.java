
package Taller1;

import java.util.Scanner;

public class punto20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar la cantidad de monedas de diferentes valores
        System.out.print("Ingrese la cantidad de monedas de 2 euros: ");
        int monedas2Euros = scanner.nextInt();

        System.out.print("Ingrese la cantidad de monedas de 1 euro: ");
        int monedas1Euro = scanner.nextInt();

        System.out.print("Ingrese la cantidad de monedas de 50 céntimos: ");
        int monedas50Centimos = scanner.nextInt();

        System.out.print("Ingrese la cantidad de monedas de 20 céntimos: ");
        int monedas20Centimos = scanner.nextInt();

        System.out.print("Ingrese la cantidad de monedas de 10 céntimos: ");
        int monedas10Centimos = scanner.nextInt();

        // Calcular el total en euros y céntimos
        int totalEuros = (monedas2Euros * 2) + (monedas1Euro * 1) + (monedas50Centimos / 2) + (monedas20Centimos / 5) + (monedas10Centimos / 10);
        int totalCentimos = (monedas50Centimos % 2 * 50) + (monedas20Centimos % 5 * 20) + (monedas10Centimos % 10 * 10);

        // Mostrar el total
        System.out.println("Tienes un total de " + totalEuros + " euros y " + totalCentimos + " céntimos.");
    }
}
