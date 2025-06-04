package pe.joedayz.concurrencia;

public  class Lateral implements Runnable {

    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " started.");

        //time processing
        try {
            // Simula trabajo con un tiempo de espera aleatorio
            Thread.sleep((int)(Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(threadName + " finished.");
    }
}
