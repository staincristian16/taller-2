/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Punto16 {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] costos = {24.00, 20.00, 21.00, 10.00, 18.00};

        System.out.println("Introduce el peso del paquete en kg:");
        double peso = scanner.nextDouble();

        if (peso > 5) {
            System.out.println("Lo sentimos, no transportamos paquetes con un peso superior a 5kg.");
        } else {
            System.out.println("Introduce el número de la zona de destino (1-5):");
            int zona = scanner.nextInt();

            if (zona < 1 || zona > 5) {
                System.out.println("Error: el numero introducido no corresponde a ninguna zona.");
            } else {
                double costo = peso * costos[zona - 1];
                System.out.println("El costo de envío es: " + costo + " euros.");
            }
        }
        
    }
    
    
    
}
