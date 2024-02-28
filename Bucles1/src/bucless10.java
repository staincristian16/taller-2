


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
public class bucless10 {
    public static void main(String[] args) {
        Scanner ñee = new Scanner(System.in);

        
        System.out.print("numero de filas: ");
        int n = ñee.nextInt();

       
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
           
                int num = 1;
                for (int k = 1; k <= j; k++) {
                    num += k;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
