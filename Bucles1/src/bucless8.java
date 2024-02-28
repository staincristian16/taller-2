


import java.util.Timer;
import java.util.TimerTask;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public class bucless8 {
    private static int horas = 0;
    private static int minutos = 0;
    private static int segundos = 0;

    public static void main(String[] args) {
       
        Timer reloj = new Timer();
        reloj.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                segundos++;

              
                if (segundos == 60) {
                    segundos = 0;
                    minutos++;
                }

                
                if (minutos == 60) {
                    minutos = 0;
                    horas++;
                }

                
                System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
            }
        }, 0, 1000);
    }
}
