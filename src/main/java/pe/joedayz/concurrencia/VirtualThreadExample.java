package pe.joedayz.concurrencia;

public class VirtualThreadExample {

    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Hola desde hilo: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // Simula operación bloqueante
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // Crear y lanzar un hilo virtual
        Thread t1 = Thread.ofVirtual().name("acme").unstarted(task);
        t1.start();

        // O usar la forma directa
        Thread t2 = Thread.startVirtualThread(task);

        // Esperamos que terminen
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
