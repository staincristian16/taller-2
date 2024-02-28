
package Taller1;

import java.util.Scanner;

public class punto18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar el nombre y los apellidos
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el primer apellido: ");
        String apellido1 = scanner.nextLine();

        System.out.print("Ingrese el segundo apellido: ");
        String apellido2 = scanner.nextLine();

        // Obtener las iniciales
        char inicialNombre = nombre.charAt(0);
        char inicialApellido1 = apellido1.charAt(0);
        char inicialApellido2 = apellido2.charAt(0);

        // Mostrar las iniciales
        System.out.println("Las iniciales son: " + inicialNombre + inicialApellido1 + inicialApellido2);
    }
}

