/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1;

import java.util.Scanner;

public class punto16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese la distancia entre los dos vehículos (D) en kilómetros: ");
            double distancia = scanner.nextDouble();

            System.out.print("Ingrese la velocidad del vehículo más lento en kilómetros por hora: ");
            double velocidadLento = scanner.nextDouble();

            System.out.print("Ingrese la velocidad del vehículo más rápido en kilómetros por hora: ");
            double velocidadRapido = scanner.nextDouble();

            // Verificar si el vehículo más rápido realmente puede alcanzar al otro
            if (velocidadRapido <= velocidadLento) {
                System.out.println("El vehículo más rápido no puede alcanzar al otro.");
            } else {
                // Calcular el tiempo en horas
                double tiempoHoras = distancia / (velocidadRapido - velocidadLento);

                // Convertir el tiempo a minutos
                double tiempoMinutos = tiempoHoras * 60;

                System.out.println("El vehículo más rápido alcanzará al otro en " + tiempoMinutos + " minutos.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor, ingrese valores numéricos válidos.");
        } finally {
            scanner.close();
        }
    }
}

