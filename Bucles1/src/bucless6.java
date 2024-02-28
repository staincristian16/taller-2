


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
public class bucless6 {
    public static void main(String[] args) {
        Scanner ñee = new Scanner(System.in);

        System.out.print("diga la base: ");
        double base = ñee.nextDouble();
        System.out.print("escribe el exponente: ");
        int exp = ñee.nextInt();

        
        if (exp < 0) {
            System.out.println("El exponente tiene que ser un número entero positivo.");
            return;
        }
        double resultado = 1;
        for (int i = 0; i < exp; i++) {
            resultado *= base;
        }
        System.out.println("El resultado de " + base + " elevado a la potencia " + exp + " es: " + resultado);
    }
}
