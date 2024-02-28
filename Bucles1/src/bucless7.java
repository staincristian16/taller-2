


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
public class bucless7 {
    public static void main(String[] args) {
        Scanner ñee = new Scanner(System.in);

       
        System.out.print("escribe el precio del producto: ");
        double precioP = ñee.nextDouble();
       
        System.out.print("escribe el plazo del mes: ");
        int plazoPago = ñee.nextInt();

        
        double pagoMes = precioP / plazoPago;
        double totalPagar = pagoMes * plazoPago;
        System.out.printf("su Pago mensual: %.2f €\n", pagoMes);
        System.out.printf("Total a pagar: %.2f €\n", totalPagar);
    }
}
