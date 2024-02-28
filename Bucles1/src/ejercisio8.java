
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
public class ejercisio8 {
    
    public static void main(String[] args) {
        Scanner ñaa = new Scanner(System.in);

        System.out.print("escriba la longitud del primer lado: ");
        int lado1 = ñaa.nextInt();

        System.out.print("escriba la longitud del segundo lado: ");
        int lado2 = ñaa.nextInt();

        System.out.print("escriba la longitud del tercer lado: ");
        int lado3 = ñaa.nextInt();

       
        String clasifica;
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            clasifica = "No es un triángulo";
        } else if (lado1 == lado2 && lado2 == lado3) {
            clasifica = "Triángulo equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            clasifica = "Triángulo isósceles";
        } else {
            clasifica = "Triángulo escaleno";

            if (Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2) ||
                    Math.pow(lado1, 2) + Math.pow(lado3, 2) == Math.pow(lado2, 2) ||
                    Math.pow(lado2, 2) + Math.pow(lado3, 2) == Math.pow(lado1, 2)) {
                clasifica += " rectángulo";
            }
        }

        System.out.println("El triángulo es " + clasifica);
    }
}
