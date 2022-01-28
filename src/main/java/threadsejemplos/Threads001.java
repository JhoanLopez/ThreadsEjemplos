package threadsejemplos;

/**
 * @date 26 ene. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class Threads001 extends Thread {
    
    static int numero;
    int cont = 0;
    
    public Threads001 (Integer num) {
        numero = num;
    }
    
    public static void main (String [] args ) { 
        Threads001 hilo = new Threads001(10);
        Threads001 hilo2 = new Threads001(10);
        Threads001 hilo3 = new Threads001(10);
        hilo.start();
        hilo2.start();
        hilo3.start();
    }
    
    @Override
    public void run() {
        int cont = 0;
        while (cont  <= numero) {
            System.out.println(getName().toString() + " " + cont);
            cont++;
        }
    }  
}
