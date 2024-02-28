/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1;

import java.util.Scanner;

public class punto17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar la hora de salida y el tiempo de viaje en segundos
        System.out.print("Ingrese la hora de salida (HH): ");
        int HH = scanner.nextInt();

        System.out.print("Ingrese los minutos de salida (MM): ");
        int MM = scanner.nextInt();

        System.out.print("Ingrese los segundos de salida (SS): ");
        int SS = scanner.nextInt();

        System.out.print("Ingrese el tiempo de viaje en segundos (T): ");
        int tiempoViaje = scanner.nextInt();

        // Calcular la hora de llegada
        int horaLlegada = (HH * 3600 + MM * 60 + SS + tiempoViaje) / 3600;
        int minutoLlegada = ((MM * 60 + SS + tiempoViaje) % 3600) / 60;
        int segundoLlegada = ((MM * 60 + SS + tiempoViaje) % 3600) % 60;

        // Mostrar la hora de llegada
        System.out.println("La hora de llegada a la ciudad B es: " + horaLlegada + " horas, " + minutoLlegada + " minutos, " + segundoLlegada + " segundos.");
    }
}
