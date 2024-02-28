


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
public class bucless3 {
    public static void main(String[] args) {
        Scanner ñee = new Scanner(System.in);

        while (true) {
            
            System.out.print("escribe cualquier caracter: ");
            char trap = ñee.next().charAt(0);

          
            trap = Character.toLowerCase(trap);

            // Evaluar si es vocal
            if (esVocal(trap)) {
                System.out.println("VOCAL");
            } else {
                System.out.println("NO VOCAL");
            }
            if (trap == ' ') {
                break;
            }
        }
    }

    private static boolean esVocal(char trap) {
        return "aeiou".indexOf(trap) != -1;
    }
}
