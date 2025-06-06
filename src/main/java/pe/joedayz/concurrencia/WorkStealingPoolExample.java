package pe.joedayz.concurrencia;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkStealingPoolExample {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newWorkStealingPool();

        for (int i = 0; i < 10; i++) {
            int id = i;
            executor.submit(() -> {
                System.out.println("Task " + id + " run by " + Thread.currentThread().getName());
            });
        }

        Thread.sleep(1000); // Espera para que las tareas finalicen
    }
}
