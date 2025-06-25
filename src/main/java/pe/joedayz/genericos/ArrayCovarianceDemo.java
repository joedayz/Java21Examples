package pe.joedayz.genericos;

public class ArrayCovarianceDemo {

    public static void main(String[] args) {
        Product[] products = new Food[10];  // OK (covariance)
        products[0] = new Drink("Tea");
    }
}

class Product {}
class Food extends Product {}
class Drink extends Product {
    String name;
    Drink(String name) {
        this.name = name;
    }
}