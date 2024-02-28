


import java.util.Random;
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
public class bucless {
    private static final int MAX_INTENTOS = 10;
    private static final int MAX_NUMERO = 100;
    private static final int MIN_NUMERO = 1;

    public static void main(String[] args) {
        Scanner ñee = new Scanner(System.in);
        Random azar = new Random();

        int numazar = azar.nextInt(MAX_NUMERO - MIN_NUMERO + 1) + MIN_NUMERO;
        int intentos = 0;
        int numIntro;
        
        do {
            intentos++;
           
            System.out.printf("escribe un numero (entre %d y %d): ", MIN_NUMERO, MAX_NUMERO);
            numIntro = ñee.nextInt();

            if (numIntro < numazar) {
                System.out.println("El número es a un mayor.");
            } else if (numIntro > numazar) {
                System.out.println("El número es menor.");
            }

        } while (numIntro != numazar && intentos < MAX_INTENTOS);

       
        if (numIntro == numazar) {
            System.out.printf("¡wuaooo! has podido adivinar %d oportunidades.\n", intentos);
        } else {
            System.out.printf("perdiste no adivinaste la respuesta era %d.\n", numazar);
        }
    }
}
