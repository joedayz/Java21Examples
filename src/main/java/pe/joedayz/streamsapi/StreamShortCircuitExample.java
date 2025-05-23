package pe.joedayz.streamsapi;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamShortCircuitExample {

    public static void main(String[] args) {

        String[] values = {"RED", "GREEN", "BLUE"};

        // Verifica si todos los elementos son "GREEN"
        boolean allGreen = Arrays.stream(values)
                .allMatch(s -> s.equals("GREEN"));
        System.out.println("Todos son GREEN: " + allGreen);

        // Verifica si al menos un elemento es "GREEN"
        boolean anyGreen = Arrays.stream(values)
                .anyMatch(s -> s.equals("GREEN"));
        System.out.println("Al menos uno es GREEN: " + anyGreen);

        // Verifica si ninguno es "GREEN"
        boolean noneGreen = Arrays.stream(values)
                .noneMatch(s -> s.equals("GREEN"));
        System.out.println("Ninguno es GREEN: " + noneGreen);

        // Obtiene un elemento cualquiera del stream
        Optional<String> anyColour = Arrays.stream(values)
                .findAny();
        anyColour.ifPresent(c -> System.out.println("Elemento cualquiera: " + c));

        // Obtiene el primer elemento del stream
        Optional<String> firstColour = Arrays.stream(values)
                .findFirst();
        firstColour.ifPresent(c -> System.out.println("Primer elemento: " + c));



        // Stream infinito de "GREEN"
        Stream<String> infiniteGreen = Stream.generate(() -> "GREEN");

        // noneMatch: esto nunca terminará porque todos son "GREEN"
        // boolean result = infiniteGreen.noneMatch(s -> s.equals("GREEN")); // 🔴 Se bloquea

        // allMatch: esto nunca terminará porque todos son "GREEN"
        // boolean result = infiniteGreen.allMatch(s -> s.equals("GREEN")); // 🔴 Se bloquea

        Stream<String> withRed = Stream.iterate("RED", s -> "GREEN");
        boolean allGreen2 = withRed.allMatch(s -> s.equals("GREEN"));
        System.out.println("Todos son GREEN: " + allGreen2);



    }
}
