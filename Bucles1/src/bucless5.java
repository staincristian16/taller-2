


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
public class bucless5 {
    public static void main(String[] args) {
        Scanner ñee = new Scanner(System.in);

        int liInferior, liSuperior;
        do {
            System.out.print("escribe el limite de abajo : ");
            liInferior = ñee.nextInt();
            System.out.print("escribe el limite de arriba: ");
            liSuperior = ñee.nextInt();
        } while (liInferior >= liSuperior);

        int suma = 0, Intervalo = 0, dentroLimites = 0;

        int num;
        do {
            System.out.print("escribe un número (0 para terminar): ");
            num = ñee.nextInt();

            
            if (num > liInferior && num < liSuperior) {
                suma += num;
            } else if (num != 0) {
                Intervalo++;
            }
           
            if (num == liInferior || num == liSuperior) {
                dentroLimites++;
            }
        } while (num != 0);

        // Mostrar resultados
        System.out.println("la suma de los números dentro del intervalo: " + suma);
        System.out.println("los números fuera del intervalo: " + Intervalo);
        System.out.println("y los números iguales a los límites del intervalo: " + dentroLimites);
    }
}
