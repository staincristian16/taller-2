
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
public class ejercisio12 {
    public static void main(String[] args) {
        Scanner ñee = new Scanner(System.in);

    
        System.out.print("escriba cuanto durara la llamada (en minutos): ");
        int tiempollamada = ñee.nextInt();

       
        System.out.print("escriba un dia de la semana (1-7): ");
        int diaSemana = ñee.nextInt();

        System.out.print("Iescriba el turno de la llamada (M/T): ");
        String turno = ñee.next();
        double costoMinuto;
        if (tiempollamada <= 5) {
            costoMinuto = 1;
        } else if (tiempollamada <= 8) {
            costoMinuto = 0.8;
        } else if (tiempollamada <= 10) {
            costoMinuto = 0.7;
        } else {
            costoMinuto = 0.5;
        }

        double costoTotalLlamada = tiempollamada * costoMinuto;

       
        double impuest;
        if (diaSemana == 1 || diaSemana == 7) {
            impuest = costoTotalLlamada * 0.03;
        } else if (turno.equalsIgnoreCase("M")) {
            impuest = costoTotalLlamada * 0.15;
        } else if (turno.equalsIgnoreCase("T")) {
            impuest = costoTotalLlamada * 0.1;
        } else {
            impuest = 0;
        }

        // Mostrar el resultado
        System.out.println("El costo por minuto es: " + costoMinuto + "€");
        System.out.println("El costo total de la llamada es: " + costoTotalLlamada + "€");
        System.out.println("El impuesto es: " + impuest + "€");
        System.out.println("El total a pagar es: " + (costoTotalLlamada + impuest) + "€");
    }
}
