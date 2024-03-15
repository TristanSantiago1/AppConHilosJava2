package Ejemplo2;

public class Programa2{
    public static void main(String[] args) throws InterruptedException{
        Corredor corredo1 = new Corredor('1');
        Corredor corredo2 = new Corredor('2');
        Corredor corredo3 = new Corredor('3');
        
        Thread p1 = new Thread(corredo1);
        Thread p2 = new Thread(corredo2);
        Thread p3 = new Thread(corredo3);

        p1.start();
        p1.join();
        p2.start();
        p2.join();
        p3.start();
        p3.join();
    }
}