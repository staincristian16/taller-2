
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
public class ejercisio17 {
    
    public static void main(String[] args) {
        Scanner ñee = new Scanner(System.in);

        
        System.out.println("Primera circunferencia:");
        System.out.print("Punto central (x1, y1): ");
        int x1 = ñee.nextInt();
        int y1 = ñee.nextInt();
        System.out.print("Radio (p1): ");
        int p1 = ñee.nextInt();

        System.out.println("Segunda circunferencia:");
        System.out.print("Punto central (x2, y2): ");
        int x2 = ñee.nextInt();
        int y2 = ñee.nextInt();
        System.out.print("Radio (p2): ");
        int p2 = ñee.nextInt();

        
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        String clasificacion;
        if (distancia == 0) {
            clasificacion = "Concéntricas";
        } else if (distancia > p1 + p2) {
            clasificacion = "Exteriores";
        } else if (distancia > 0 && distancia < Math.abs(p1 - p2)) {
            clasificacion = "Interiores";
        } else if (distancia == p1 + p2) {
            clasificacion = "Tangentes exteriores";
        } else if (distancia == Math.abs(p1 - p2)) {
            clasificacion = "Tangentes interiores";
        } else {
            clasificacion = "Secantes";
        }
        
        System.out.println("Las circunferencias son " + clasificacion);
    }
    
}
