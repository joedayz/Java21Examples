package pe.joedayz.concurrencia;

public class Shared
{
    public int x;
    public volatile int y; // y es la variable compartida marcada como volatile
}


class VolatileExample {


    public static void main(String[] args) {
        Shared s = new Shared();

        // Hilo 1: espera a que s.y sea >= 1
        new Thread(() -> {
            System.out.println("Thread 1 esperando...");
            while (s.y < 1) {
                // Esperando a que s.y se actualice
            }
            System.out.println("Thread 1 terminó. s.x = " + s.x);
        }).start();

        // Hilo 2: modifica los valores
        new Thread(() -> {
            try {
                Thread.sleep(1000); // Espera un segundo antes de modificar
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s.x = 2;
            s.y = 2; // Esta escritura es visible para el otro hilo por ser volatile
            System.out.println("Thread 2 escribió: x = " + s.x + ", y = " + s.y);
        }).start();
    }
}