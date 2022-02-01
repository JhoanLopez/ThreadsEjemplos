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
        
        // Se utiliza el método wait() para que el hilo espere a que otro hiilo envie un notify() o notifyAll()
        //threads01.wait();
        
        // Cuando se envia un notify() o notifyAll() se reanudan los hilos que están a la espera
        //threads01.notifyAll();   
    }
    
    @Override
    public void run () {
        for (int k = 1; k <= numero; k++) {
            
            try {
                System.out.println(k + " " + this.getName() + " Prioridad: " + this.getPriority() + " Info: " + this.toString());
                System.out.println("Numero de hilos activos: " + this.activeCount());
                System.out.println("Estado del hilo: "  + this.getState());
                this.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Threads002.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
