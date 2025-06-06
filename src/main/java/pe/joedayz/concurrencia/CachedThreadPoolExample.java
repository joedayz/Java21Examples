package pe.joedayz.concurrencia;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExample
{
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            executor.submit(() -> {
                System.out.println("Running task: " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}
