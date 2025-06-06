package pe.joedayz.concurrencia;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorExample {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable task = () -> {
            System.out.println("Task executed by " + Thread.currentThread().getName());
        };

        for (int i = 0; i < 3; i++) {
            executor.submit(task);
        }

        executor.shutdown();
    }
}
