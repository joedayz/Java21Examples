package pe.joedayz.streamsapi;

import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(List.of(new Product("Tea", 1.99), new Product("Cake", 2.99))),
                new Order(List.of(new Product("Cookie", 1.99), new Product("Coffee", 1.99), new Product("Cake", 2.99))),
                new Order(List.of(new Product("Tea", 1.99), new Product("Cookie", 2.99)))
        );

        // Queremos la suma total de los productos "Tea"
        double totalTea = orders.stream()
                .flatMap(order -> order.items())
                .filter(p -> p.getName().equals("Tea"))
                .mapToDouble(p -> p.getPrice())
                .sum();

        System.out.println(totalTea);



    }
}


class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return name + ": $" + price;
    }
}

class Order {
    private List<Product> items;

    public Order(List<Product> items) {
        this.items = items;
    }

    public Stream<Product> items() {
        return items.stream();
    }
}
