package pe.joedayz.concurrencia;

public class CounterExample {

    static int counter = 0;

    public static  void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        CounterExample ce = new CounterExample();
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (ce) {
                    increment();
                }
            }

        };

        Thread t1 = new Thread(task);
        t1.setDaemon(false);
        Thread t2 = new Thread(task);
        t1.setDaemon(false);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Valor final del contador: " + counter);
    }
}
