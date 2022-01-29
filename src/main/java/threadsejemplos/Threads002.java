package threadsejemplos;

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
        Threads002 threads = new Threads002(100);
        System.out.println("______ARRIBA______");
        System.out.println(numero);
        System.out.println("______ABAJO______");
    }
    
    public String getThreads00 () {
        return "";
    }
}
