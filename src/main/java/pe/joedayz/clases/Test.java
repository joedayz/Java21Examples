package pe.joedayz.clases;

import java.time.ZoneId;

import static java.lang.Math.random; // import static

public class Test {

    public static void main(String[] args) {
        System.out.println("Inicio el programa");
        System.out.println(random());
        System.out.println(Math.max(5, 3));

        double valor = random();

        ZoneId.of("America/Lima");

    }
}
