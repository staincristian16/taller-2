
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
public class ejercisio13 {
    
    public static void main(String[] args) {
        Scanner ñee = new Scanner(System.in);

       
        System.out.print("escriba el resultado del dado (1-6): ");
        int resultadoDado = ñee.nextInt();

        // Validar el resultado
        if (resultadoDado < 1 || resultadoDado > 6) {
            System.out.println("ERROR: número incorrecto");
            return;
        }

    
        int caraOpuesta = 7 - resultadoDado;

        
        String nombreCaraOpuesta;
        switch (caraOpuesta) {
            case 1:
                nombreCaraOpuesta = "1";
                break;
            case 2:
                nombreCaraOpuesta = "2";
                break;
            case 3:
                nombreCaraOpuesta = "3";
                break;
            case 4:
                nombreCaraOpuesta = "4";
                break;
            case 5:
                nombreCaraOpuesta = "5";
                break;
            case 6:
                nombreCaraOpuesta = "6";
                break;
            default:
                nombreCaraOpuesta = "inválido";
        }

        System.out.println("La cara opuesta al " + resultadoDado + " es el " + nombreCaraOpuesta);
    }
    
}
