package pe.joedayz.concurrencia;

public class LivelockExample
{
    static volatile boolean aOver = false;
    static volatile boolean bOver = false;

    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            while (!bOver) {
                System.out.println("Thread A: Esperando a que B termine...");
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
            }
            System.out.println("Thread A: Acción completada");
            aOver = true;
        });

        Thread threadB = new Thread(() -> {
            while (!aOver) {
                System.out.println("Thread B: Esperando a que A termine...");
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
            }
            System.out.println("Thread B: Acción completada");
            bOver = true;
        });

        threadA.start();
        threadB.start();
    }
}
