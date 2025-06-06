package pe.joedayz.concurrencia;

import java.util.concurrent.*;

public class CallableFutureExample {

    public static void main(String[] args) {
        // Crear un ExecutorService con un solo hilo
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Crear un Callable que retorna un valor
        Callable<String> callableTask = () -> {
            Thread.sleep(2000); // Simula trabajo largo
            return "Resultado de la tarea";
        };

        // Enviar la tarea y obtener un Future
        Future<String> future = executor.submit(callableTask);

        System.out.println("Tarea enviada... esperando resultado");

        try {
            // Bloquea hasta que la tarea termine y retorna el resultado
            String result = future.get(10, TimeUnit.SECONDS);
            System.out.println("Resultado obtenido: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

        // Apagar el executor
        executor.shutdown();

    }
}
