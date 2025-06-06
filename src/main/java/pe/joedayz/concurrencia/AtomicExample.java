package pe.joedayz.concurrencia;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

    public static class Shared {
        public AtomicInteger x = new AtomicInteger(0);
    }

    public static void main(String[] args) {
        Shared s = new Shared();

        Runnable r = () -> {
            int y = 0;
            while (y < 10) {
                y = s.x.incrementAndGet(); // operación atómica
                System.out.println(Thread.currentThread().getName() + " incrementó x a: " + y);
            }
        };

        // Ejecutamos dos hilos
        new Thread(r, "Hilo-1").start();
        new Thread(r, "Hilo-2").start();
    }
}
