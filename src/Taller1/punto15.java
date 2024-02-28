
package Taller1;

import java.util.Scanner;

public class punto15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el valor de a: ");
            int a = scanner.nextInt();

            System.out.print("Ingrese el valor de b: ");
            int b = scanner.nextInt();
         
            int temp = a;
            a = b;
            b = temp;

            System.out.println("el cambio de valores seria ");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            
            
        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor, ingrese valores numéricos válidos.");
        } finally {
            scanner.close();
        }
    }
}
