


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
public class bucless4 {
    public static void main(String[] args) {
        Scanner ñee = new Scanner(System.in);

        System.out.print("escribe el primer numero: ");
        int num1 = ñee.nextInt();
        System.out.print("escribe el segundo numero: ");
        int num2;

        while (true) {
            num2 = ñee.nextInt();
            if (num2 >= num1) {
                break;
            }
            System.out.println("El segundo número debe ser mucho mayor o igual al primer numero. Inténtalo de nuevo: ");
        }
        
        System.out.println("los números pares son entre " + num1 + " y " + num2 + ":");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
