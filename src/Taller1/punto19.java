
package Taller1;

import java.util.Scanner;

public class punto19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar el número de respuestas correctas, incorrectas y no contestadas
        System.out.print("Ingrese el número de respuestas correctas: ");
        int respuestasCorrectas = scanner.nextInt();

        System.out.print("Ingrese el número de respuestas incorrectas: ");
        int respuestasIncorrectas = scanner.nextInt();

        System.out.print("Ingrese el número de respuestas no contestadas: ");
        int respuestasNoContestadas = scanner.nextInt();

        // Calcular la nota final
        int notaFinal = calcularNotaFinal(respuestasCorrectas, respuestasIncorrectas, respuestasNoContestadas);

        // Mostrar la nota final
        System.out.println("La nota final del estudiante es: " + notaFinal + " puntos.");
    }

    // Función para calcular la nota final
    public static int calcularNotaFinal(int correctas, int incorrectas, int noContestadas) {
        int notaFinal = (correctas * 5) - (incorrectas * 1);
        return Math.max(notaFinal, 0);  // La nota final no puede ser negativa
    }
}
