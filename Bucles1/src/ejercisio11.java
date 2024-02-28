
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
public class ejercisio11 {
    
     public static void main(String[] args) {
        Scanner ñee = new Scanner(System.in);
        System.out.print("escriba el numero total de estudiantes: ");
        int numeroestudiantes = ñee.nextInt();

        
        double costoTotal;
        if (numeroestudiantes >= 100) {
            costoTotal = numeroestudiantes * 65;
        } else if (numeroestudiantes >= 50) {
            costoTotal = numeroestudiantes * 70;
        } else if (numeroestudiantes >= 30) {
            costoTotal = numeroestudiantes * 95;
        } else {
            costoTotal = 4000;
        }

        
        double costoPorAlumno = costoTotal / numeroestudiantes;

        System.out.println("El valor total del viaje es: " + costoTotal + "€");
        System.out.println("El valor por alumno es: " + costoPorAlumno + "€");
        
        if (numeroestudiantes < 30) {
            System.out.println("el pago para la compañia de autobuses es: " + costoTotal + "€");
        } else {
            System.out.println("el pago para la compañia de autobuses es: " + (costoTotal - (numeroestudiantes * 65)) + "€");
        }
    }
}
