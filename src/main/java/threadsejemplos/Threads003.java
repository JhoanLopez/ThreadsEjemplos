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
   
        /* De esta manera se crea un objero Thread al que le paso un objeto de esta clase
        que implementa Runnable y lo inicio con .star() -> new Thread(hilo).start();
        */
        new Thread(hilo).start();
        new Thread(hilo).start();
        new Thread(hilo).start();
    }
}
