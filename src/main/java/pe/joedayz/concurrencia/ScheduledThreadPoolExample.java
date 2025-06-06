package pe.joedayz.concurrencia;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExample
{
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Running scheduled task: " + Thread.currentThread().getName());

        ScheduledExecutorService ses = Executors.newScheduledThreadPool(3);
        ses.scheduleAtFixedRate(task, 10, 5, TimeUnit.SECONDS);
    }
}
