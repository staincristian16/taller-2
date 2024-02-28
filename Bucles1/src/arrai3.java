
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
public class arrai3 {
     public static void main(String[] args) {
        Scanner ñee = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> aaa = new ArrayList<>();

        // Leer 20 números por teclado y almacenarlos en la matriz
        for (int i = 0; i < 4; i++) {
            aaa.add(new ArrayList<>());
            for (int j = 0; j < 5; j++) {
                System.out.printf("Introduzca el número (%d, %d): ", i + 1, j + 1);
                aaa.get(i).add(ñee.nextInt());
            }
        }

        int[][] sumascompleta = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumascompleta[i][j] = 0;
                for (int k = 0; k <= j; k++) {
                    sumascompleta[i][j] += aaa.get(i).get(k);
                }
                for (int k = 0; k <= i; k++) {
                    sumascompleta[i][j] += aaa.get(k).get(j);
                }
                sumascompleta[i][j] -= aaa.get(i).get(j); 
            }
        }
        
        
        for (int r = 0; r < 4; r++) {
            for (int p = 0; p < 5; p++) {
                System.out.printf("  ", aaa.get(r).get(p));
            }
            System.out.printf("   ", sumascompleta[r][4]);
        }
        
        int totalsuma = 0;
        for (int i = 0; i < 4; i++) {
            totalsuma += sumascompleta[i][4];
        }
        System.out.println(".................");
        System.out.printf("| Suma total: ", totalsuma);
    }
}
