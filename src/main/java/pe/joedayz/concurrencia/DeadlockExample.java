package pe.joedayz.concurrencia;

public class DeadlockExample {

    public static void main(String[] args) {
        final Object resourceA = new Object();
        final Object resourceB = new Object();


        Thread t1 = new Thread(() -> {
            synchronized (resourceA) {
                System.out.println("Thread 1: Locked A");
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                synchronized (resourceB) {
                    System.out.println("Thread 1: Locked B");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resourceB) {
                System.out.println("Thread 2: Locked B");
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                synchronized (resourceA) {
                    System.out.println("Thread 2: Locked A");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
