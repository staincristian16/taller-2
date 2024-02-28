


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
public class bucless9 {
    public static void main(String[] args) {
        Scanner ñee = new Scanner(System.in);

        // Pedir la cantidad de números primos a mostrar
        System.out.print("escribe la cantidad de numeros primos que tu quieras mostrar: ");
        int n = ñee.nextInt();
        int encontrar = 0;
        for (int i = 2; ; i++) {
            if (esPrimo(i)) {
                
                System.out.print(i + " ");
                encontrar++;
                if (encontrar == n) {
                    break;
                }
            }
        }
    }
    private static boolean esPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
