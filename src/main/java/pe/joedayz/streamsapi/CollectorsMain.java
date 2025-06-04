package pe.joedayz.streamsapi;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsMain {


    static class Product {
        private String name;
        private Double price;

        public Product(String name, Double price) {
            this.name = name;
            this.price = price;
        }

        public Double getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        List<Product> list = List.of(
                new Product("Apple", 1.5),
                new Product("Banana", 1.0),
                new Product("Orange", 2.0)
        );


        DoubleSummaryStatistics stats = list.stream()
                .collect(Collectors.summarizingDouble(p -> p.getPrice()));

        System.out.println("Average: " + stats.getAverage());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Count: " + stats.getCount());

        String names = list.stream()
                .collect(Collectors.mapping(Product::getName, Collectors.joining(", ")));

        System.out.println("Names: " + names); //Names: Apple, Banana, Orange
    }
}


