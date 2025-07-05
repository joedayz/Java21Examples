package pe.joedayz.genericos;

public class ArrayCovarianceDemo {

    public static void main(String[] args) {
        Product[] products = new Food[10];  // OK (covariance)
        products[0] = new Drink("Tea");
    }
}

class Product {
    String name;
    double price;
    Product(String name){
        this.name = name;
        this.price = 0.0;
    }
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
class Food extends Product {
    Food(){
        super("ProductName");
    }
    Food(String name, double price) {
        super(name, price);
    }
}
class Drink extends Product {
    String name;
    Drink(String name) {
        super(name);
    }
    Drink(String name, double price) {
        super(name, price);
    }
}