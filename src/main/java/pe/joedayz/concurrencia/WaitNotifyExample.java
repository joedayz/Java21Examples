package pe.joedayz.concurrencia;

public class WaitNotifyExample {

    public static void main(String[] args) {

        Object obj = new Object();

        Runnable r = () -> {
            try {
                synchronized (obj) {
                    System.out.println("Thread esperando...");
                    obj.wait();
                    System.out.println("Thread reanudado!");
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        };

        Thread t = new Thread(r);
        t.start();

        try {
            Thread.sleep(1000); // Espera para asegurarse de que el hilo esté esperando
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        synchronized (obj) {
            System.out.println("Notificando al hilo...");
            obj.notify();
        }
    }
}
