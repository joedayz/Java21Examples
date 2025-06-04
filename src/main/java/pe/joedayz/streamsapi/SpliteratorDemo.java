package pe.joedayz.streamsapi;

import java.util.List;
import java.util.Random;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpliteratorDemo {


//    public static void main(String[] args) {
//        // Generamos 10 números aleatorios entre 0 y 10
//        IntStream randomInts = new Random().ints(10, 0, 10);
//
//        // Obtenemos un Spliterator para recorrerlos
//        Spliterator<Integer> s1 = randomInts.boxed().spliterator();
//
//        // Procesamos el primer elemento
//        s1.tryAdvance(v -> System.out.println("First value: " + v));
//
//        // Intentamos dividir el Spliterator
//        Spliterator<Integer> s2 = s1.trySplit();
//
//        if (s2 == null) {
//            System.out.println("Did not split");
//        } else {
//            System.out.println("s1 (remaining first half):");
//            s1.forEachRemaining(v -> System.out.println("s1 -> " + v));
//
//            System.out.println("s2 (split second half):");
//            s2.forEachRemaining(v -> System.out.println("s2 -> " + v));
//        }
//    }

    public static void main(String[] args) {
        // Generamos una lista de 10 números aleatorios entre 0 y 9
        List<Integer> numbers = new Random()
                .ints(10, 0, 10)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Generated numbers: " + numbers);

        // Obtenemos el Spliterator
        Spliterator<Integer> s1 = numbers.spliterator();

        // Procesamos un solo elemento
        s1.tryAdvance(v -> System.out.println("First element processed: " + v));

        // Intentamos dividir el Spliterator
        Spliterator<Integer> s2 = s1.trySplit();

        if (s2 == null) {
            System.out.println("Did not split");
        } else {
            // Procesamos los elementos restantes de cada mitad
            System.out.println("Remaining in s1:");
            s1.forEachRemaining(v -> System.out.println("s1 -> " + v));

            System.out.println("Remaining in s2:");
            s2.forEachRemaining(v -> System.out.println("s2 -> " + v));
        }
    }
}
