package pe.joedayz.streamsapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class OperacionesIntermedias {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "C", "B", "D", "B", "D");
        list.stream()
                .distinct()
                .forEach(System.out::println); // Output: A C B D


        // sorted()
        list.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println); // Output: A B C D

// sorted con Comparator
        list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println); // Output: D C B A


        list.stream()
                .distinct()
                .sorted()
                .skip(2)
                .forEach(System.out::println); // Output: C D


        List<String> list2 = Arrays.asList("B", "C", "A", "E", "D", "F");
        list2.stream()
                .takeWhile(s -> !s.equals("D"))
                .forEach(System.out::println); // Output: B C A E

        list2.stream()
                .dropWhile(s -> !s.equals("C"))
                .forEach(System.out::println); // Output: C A E D F

        list2.stream()
                .limit(3)
                .forEach(System.out::println); // Output: B C A

        Stream.of("B", "C", "A", "E", "D", "F")
                .takeWhile(s -> !s.equals("D"))     // B C A E
                .dropWhile(s -> !s.equals("C"))     // C A E
                .limit(2)                            // C A
                .forEach(s -> System.out.println(s.toLowerCase()));
        // Output:
        // c
        // a
    }
}
