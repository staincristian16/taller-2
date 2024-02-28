
import java.util.ArrayList;
import java.util.Random;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public class arrai4 {
     public static void main(String[] args) {
       
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();

        Random aletorio = new Random();
        for (int i = 0; i < 4; i++) {
            matriz.add(new ArrayList<>());
            
            for (int j = 0; j < 5; j++) {
                
                
              matriz.get(i).add(aletorio.nextInt(900) + 100);
            }
        }

        int[][] sumasParcial = new int[4][5];
        for (int a = 0; a < 4; a++) {
            for (int e = 0; e < 5; e++) {
                sumasParcial[a][e] = 0;
                for (int k = 0; k <= e; k++) {
                    sumasParcial[a][e] += matriz.get(a).get(k);
                }
                for (int k = 0; k <= a; k++) {
                    sumasParcial[a][e] += matriz.get(k).get(e);
                }
                sumasParcial[e][e] -= matriz.get(a).get(e);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("  ", matriz.get(i).get(j));
            }
            System.out.printf("  ", sumasParcial[i][4]);
        }
        
        int sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            sumaTotal += sumasParcial[i][4];
        }
        System.out.println("................");
        System.out.printf("| la Suma total: ", sumaTotal);
    }
}
