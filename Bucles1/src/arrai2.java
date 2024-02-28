
import java.util.ArrayList;
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
public class arrai2 {
    public static void main(String[] args) {
        Scanner ñee = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        System.out.println("escribe 10 numeros a la azar :");
        for (int i = 0; i < 10; i++) {
            num.add(ñee.nextInt());
        }
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        for (int num1 : num) {
            if (num1 > maximo) {
                maximo = num1;
            }
            if (num1 < minimo) {
                minimo = num1;
            }
        }
        for (int num1 : num) {
            if (num1 == maximo) {
                System.out.println(num + " (máximo)");
            } else if (num1 == minimo) {
                System.out.println(num + " (mínimo)");
            } else {
                System.out.println(num);
            }
        }
    }
}
