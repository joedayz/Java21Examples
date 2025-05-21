package pe.joedayz.streamsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class StreamMapExample {

    static class Product {
        private String name;

        public Product(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("  Book  "));
        list.add(new Product("Cake"));
        list.add(new Product("   Toy"));
        list.add(new Product("Apple "));

        Function<Product, String> nameMapper = p -> p.getName();

        UnaryOperator<String> trimMapper = n -> n.strip();

        ToIntFunction<String> lengthMapper = n -> n.length();

        list.stream()
                .map(nameMapper.andThen(trimMapper))
                .mapToInt(lengthMapper)
                .forEach(System.out::println);



    }
}
