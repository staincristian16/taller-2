
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
public class ejercisio6 {
    
     public static void main(String[] args) {
        Scanner ñee = new Scanner(System.in);

        System.out.print("escriba la edad: ");
        int edad = ñee.nextInt();

        System.out.print("escriba la nota: ");
        double nota = ñee.nextDouble();

        System.out.print("escriba el sexo (M/F): ");
        String sexo = ñee.next();

        if (edad < 18 || nota < 5 || !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
            System.out.println("Error. Datos no válidos.");
            return;
        }

        String resultado;
        if (sexo.equalsIgnoreCase("M")) {
            resultado = (nota >= 5 && edad >= 18) ? "POSIBLE" : "NO ACEPTADA";
        } else {
            resultado = (nota >= 5 && edad >= 18) ? "ACEPTADA" : "NO ACEPTADA";
        }
        
        System.out.println("Solicitud " + resultado);
    }
    
}
