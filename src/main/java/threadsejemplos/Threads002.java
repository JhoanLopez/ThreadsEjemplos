package threadsejemplos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @date 29 ene. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class Threads002 extends Thread {
    
    static int numero;

    public Threads002 (Integer num) {
        numero = num;
    }
    
    public static void main (String [] args) {
        Threads002 threads01 = new Threads002(1);
        threads01.setName("Hilo 01");
        Threads002 threads02 = new Threads002(1);
        threads02.setName("Hilo 02");
        Threads002 threads03 = new Threads002(1);
        threads03.setName("Hilo 03");
        threads01.start();
        threads02.start();
        threads03.start();   
    }
    
    @Override
    public void run () {
        for (int k = 1; k <= numero; k++) {
            System.out.println(k + " " + this.getName() + " Prioridad: " + this.getPriority() + " Info: " + this.toString());
            System.out.println("Numero de hilos activos: " + this.activeCount());
            System.out.println("Estado del hilo: "  + this.getState());
            try {
                this.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Threads002.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
