
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
public class ejercisio9 {
    
    public static void main(String[] args) {
        Scanner ñee = new Scanner(System.in);

        System.out.print("Introduzca un año: ");
        int año = ñee.nextInt();

        boolean añoBisiesto;
        if (año % 4 == 0) {
            añoBisiesto = (año % 100 != 0) || (año % 400 == 0);
        } else {
            añoBisiesto = false;
        }
        if (añoBisiesto) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }
    }
    
}
