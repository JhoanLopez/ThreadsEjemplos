package threadsejemplos;

/**
 * @date 30 ene. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class Threads003 implements Runnable {
    
    public Threads003 () {
        
    }
    
    @Override
    public void run (){
        System.out.println("Hola desde el hilo: " + Thread.currentThread().getId());
    }
    
    public static void main (String [] args) {
        Threads003 hilo = new Threads003();
        
        Thread uno = new Thread(hilo);
        uno.start();
        Thread dos = new Thread(hilo);
        dos.start();
        Thread tres = new Thread(hilo);
        tres.start(); 
    }
}
