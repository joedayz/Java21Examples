package pe.joedayz.concurrencia;

public class Some {

    public synchronized void  a() {

    }
    public static synchronized void  b() {

    }
    public void c() {

    }

    public static void main(String[] args) {
        Some s = new Some();
        Runnable r = () -> {
            s.a();                    // sincronizado con el objeto s
            Some.b();                 // sincronizado con la clase Some
            synchronized (s) {        // bloque sincronizado explícitamente con el objeto s
                s.c();
            }
        };

        new Thread(r).start();
        new Thread(r).start();
    }
}
