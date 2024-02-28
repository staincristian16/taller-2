/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Punto15 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un numero entero entre uno y doce:");

            int[] diasDelMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int mes = scanner.nextInt();

            if (mes < 1 || mes > 12) {
                System.out.println("Error: el numero introducido no corresponde a ningun mes.");
            } else if (mes == 2) {
                System.out.println("El mes tiene 28 días en un año normal y 29 en un año bisiesto.");
            } else {
                System.out.println("El mes tiene " + diasDelMes[mes - 1] + " dias.");
            }
        }
    
}
