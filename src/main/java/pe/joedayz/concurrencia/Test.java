package pe.joedayz.concurrencia;

public class Test {
    public static void main(String[] args) {

        Runnable r = () -> {
            System.out.println("Thread is running: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // Simula trabajo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };


//
//        Thread t1 = new Thread(r, "Hilo-1");
//        Thread t2 = new Thread(r, "Hilo-2");
//
//        t1.start();
//        t2.start();
//
//        try {
//            Thread.sleep(50); // Da tiempo a que los hilos empiecen
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        boolean x = t2.isAlive();
//        System.out.println("¿t2 está vivo? " + x);
//
//        Thread.State phase = t1.getState();
//        System.out.println("Estado de t1: " + phase);
//
//
//        System.out.println("Intentando reiniciar t1...");
//
//        try {
//            t1.start();
//        } catch (IllegalThreadStateException e) {
//            System.err.println("ERROR: No se puede reiniciar un hilo que ya se ejecutó.");
//        }




//        Thread t1 = new Thread(r);
//        t1.start();
//        t1.start(); // Esto lanza IllegalThreadStateException

        Lateral la = new Lateral();
        new Thread(la).start();
        new Thread(la).start();
        new Thread(la).start();
        new Thread(la).start();
        new Thread(la).start();



        System.out.println("Main thread finished launching threads.");
    }
}