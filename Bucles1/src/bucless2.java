


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
public class bucless2 {
    public static void main(String[] args) {
        Scanner ñee = new Scanner(System.in);

  
        System.out.print("escribe la cantidad de numeros que quieras: ");
        int cantidadNum = ñee.nextInt();

        int mayoresdeCero = 0;
        int menoresdeCero = 0;
        int igualdeCero = 0;

        // Leer y contar los números
        for (int i = 0; i < cantidadNum; i++) {
            System.out.printf("escribe el numero %d: ", i + 1);
            int num = ñee.nextInt();

            if (num > 0) {
                mayoresdeCero++;
            } else if (num < 0) {
                menoresdeCero++;
            } else {
                igualdeCero++;
            }
        }

        // Mostrar resultados
        System.out.println(" mayores que 0: " + mayoresdeCero);
        System.out.println(" menores que 0: " + menoresdeCero);
        System.out.println(" iguales a 0: " + igualdeCero);
    }
    
}
