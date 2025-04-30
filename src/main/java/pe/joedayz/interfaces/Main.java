package pe.joedayz.interfaces;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Product[] products = {
                new Product("Tea"),
                new Product("Cofee"),
                new Product("Cake"),
        };
        Arrays.sort(products, new ProductNameSorter());

        Arrays.stream(products).forEach(System.out::println);
    }
}
