package pe.joedayz.streamsapi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {


    static class Product {
        private String name;
        private BigDecimal price;
        private BigDecimal discount;

        public Product(String name, BigDecimal price) {
            this.name = name;
            this.price = price;
            this.discount = BigDecimal.ZERO;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setDiscount(BigDecimal discount) {
            this.discount = discount;
        }

        @Override
        public String toString() {
            return name + " - Price: " + price + " - Discount: " + discount;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Product)) return false;
            Product other = (Product) obj;
            return this.name.equals(other.name) && this.price.equals(other.price);
        }

        @Override
        public int hashCode() {
            return name.hashCode() + price.hashCode();
        }
    }

    static class Food extends Product {
        public Food(String name, BigDecimal price) {
            super(name, price);
        }
    }

    public static void main(String[] args) {
//        List<String> nombres = Arrays.asList("Juan", "Pedro", "Jorge", "Ana", "Julia", "María");
//
//        List<String> nombresConJ = nombres.stream()
//                .filter(nombre -> nombre.startsWith("J"))
//                .collect(Collectors.toList());
//        System.out.println(nombresConJ);

        List<Product> list = new ArrayList<>();
        list.add(new Product("Book", BigDecimal.valueOf(1.99)));
        list.add(new Food("Cake", BigDecimal.valueOf(1.99)));
        list.add(new Product("Toy", BigDecimal.valueOf(10.00)));
        list.add(new Food("Apple", BigDecimal.valueOf(0.99)));

        Predicate<Product> foodFilter = p -> p instanceof Food;
        Predicate<Product> priceFilter = p -> p.getPrice().compareTo(BigDecimal.valueOf(2)) < 0;

        // Aplica descuento a productos que NO sean comida o que cuesten menos de 2
        list.stream()
                .filter(foodFilter.negate().or(priceFilter))
                .forEach(p -> p.setDiscount(BigDecimal.valueOf(0.1)));

        // Aplica descuento a un producto específico (Food "Cake", 1.99)
        list.stream()
                .filter(Predicate.isEqual(new Food("Cake", BigDecimal.valueOf(1.99))))
                .forEach(p -> p.setDiscount(BigDecimal.valueOf(0.1)));

        // Mostrar resultados
        list.forEach(System.out::println);


    }
}
