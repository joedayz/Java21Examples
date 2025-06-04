package pe.joedayz.concurrencia;

public class InterruptExample {

    public static void main(String[] args) {
        Runnable r = () -> {
            Thread ct = Thread.currentThread();

            while (!ct.isInterrupted()) { // Check interrupt signal when running
                System.out.println("Thread is running...");

                try {
                    Thread.sleep(1000); // Enter timed waiting state for 1000 milliseconds
                } catch (InterruptedException ex) {
                    System.out.println("Thread was interrupted during sleep.");
                    // Perform interrupted when waiting actions
                    return; // Exit run method (terminate thread)
                }
            }

            System.out.println("Thread detected interruption and exited loop.");
        };

        Thread t = new Thread(r);
        t.start();

        try {
            Thread.sleep(3000); // Let the thread run for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.interrupt(); // Send interrupt signal
        System.out.println("Main thread sent interrupt signal.");
    }
}
