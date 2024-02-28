
import java.util.ArrayList;
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
public class arrai1 {
    
    public static void main(String[] args) {
        Scanner ñee = new Scanner(System.in);

        ArrayList<Integer> num = new ArrayList<>();

        System.out.println("escriba diez números al azar:");
        for (int i = 0; i < 10; i++) {
            num.add(ñee.nextInt());
        }
        
        System.out.println("\nNúmeros en el orden invertido:");
        for (int i = num.size() - 1; i >= 0; i--) {
            System.out.println(num.get(i));
        }
    }
}
