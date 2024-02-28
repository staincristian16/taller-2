
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
public class ejercisio10 {
    
    public static void main(String[] args) {
        Scanner ñee = new Scanner(System.in);

       
        System.out.print("escriba el tipo de uva (A/B): ");
        String tipo = ñee.next();

        System.out.print("escriba el tamaño de la uva (1/2): ");
        int tamaño = ñee.nextInt();

        System.out.print("escriba el precio inicial por kilo: ");
        double primerprecio = ñee.nextDouble();

        double precioFinal = primerprecio;
        if (tipo.equalsIgnoreCase("A")) {
            if (tamaño == 1) {
                precioFinal += 0.2;
            } else if (tamaño == 2) {
                precioFinal += 0.3;
            }
        } else if (tipo.equalsIgnoreCase("B")) {
            if (tamaño == 1) {
                precioFinal -= 0.3;
            } else if (tamaño == 2) {
                precioFinal -= 0.5;
            }
        }
        
        System.out.println("El precio  por kilo de uva es: " + precioFinal + "€");
    }
}
