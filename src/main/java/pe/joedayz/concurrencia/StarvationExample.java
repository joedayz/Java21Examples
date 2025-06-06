package pe.joedayz.concurrencia;

public class StarvationExample {

    public static void main(String[] args) {
        Object lock = new Object();

        Runnable longTask = () -> {
            synchronized (lock) {
                System.out.println("Long task running...");
                try { Thread.sleep(10000); } catch (InterruptedException ignored) {}
                System.out.println("Long task done");
            }
        };

        Runnable starvingTask = () -> {
            while (true) {
                synchronized (lock) {
                    System.out.println("Starving task got the lock!");
                    break;
                }
            }
        };

        new Thread(longTask).start();           // Hilo ocupa el recurso por mucho tiempo
        new Thread(starvingTask).start();       // Hilo espera y sufre inanición
    }
}
