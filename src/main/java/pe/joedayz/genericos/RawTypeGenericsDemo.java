package pe.joedayz.genericos;

import java.util.ArrayList;
import java.util.List;

public class RawTypeGenericsDemo {

    public static void main(String[] args) {
        List<Food> foods = new ArrayList<>();
        List values = foods;  // raw type — sin generics

        List<Product> products = values; //no hay warning - pero es inseguro
        products.add(new Drink("Tea")); // lo esta agregando en una lista de Food

        Drink x1 = (Drink) values.get(0); // no dio problema
        Food x2 = foods.get(0); // exception

    }
}


//class Product {}
//class Food extends Product {}
//class Drink extends Product {
//    String name;
//    Drink(String name) {
//        this.name = name;
//    }
//}