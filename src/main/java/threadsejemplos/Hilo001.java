package threadsejemplos;

/**
 * @date 26 ene. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class Hilo001 extends Thread {
    
    static int numero;
    int cont = 0;
    
    public Hilo001 (Integer num) {
        numero = num;
    }
    
    public static void main (String [] args ) { 
        Hilo001 hilo = new Hilo001(10);
        Hilo001 hilo2 = new Hilo001(10);
        Hilo001 hilo3 = new Hilo001(10);
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
