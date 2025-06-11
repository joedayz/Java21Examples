package pe.joedayz.concurrencia;

public class ManyVirtualThreads {

    public static void main(String[] args) {
        for (int i = 0; i < 100_000; i++) {
            Thread.startVirtualThread(() -> {
                // Simula trabajo I/O bound
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        System.out.println("Lanzados 100,000 virtual threads");
    }
}
