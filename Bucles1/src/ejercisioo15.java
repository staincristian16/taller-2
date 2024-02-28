
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
public class ejercisioo15 {
    
     public static void main(String[] args) {
        Scanner ñame = new Scanner(System.in);

        System.out.println("escribe el numero de A: ");
        int A = ñame.nextInt();
        System.out.println("escribe el numero de B: ");
        int B = ñame.nextInt();
        int aux = A;
        A = B;
        B = aux;

        System.out.println("El valor de A es: " + A);
        System.out.println("El valor  de B es: " + B);
    
}
}
