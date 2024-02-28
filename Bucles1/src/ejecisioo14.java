
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
public class ejecisioo14 {
    
    public static void main(String[] args) {
        Scanner ñaa = new Scanner(System.in);
        System.out.println("hola escribe cualquier numero: ");
        int num = ñaa.nextInt();
        int primerDigi = num / 10;
        int segundoDigi = num % 10;

        int numeroInver = segundoDigi * 10 + primerDigi;
        System.out.println("El número invertido es: " + numeroInver);
    
}
    
}
