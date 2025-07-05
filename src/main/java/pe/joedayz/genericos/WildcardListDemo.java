package pe.joedayz.genericos;

import java.util.ArrayList;
import java.util.List;

public class WildcardListDemo {

    public static void main(String[] args) {
        List listOfAnyObjects1 = new ArrayList();          // raw type (unsafe)
        List<Object> listOfAnyObjects2 = new ArrayList<>(); // safe

        listOfAnyObjects1.add("Text");
        listOfAnyObjects1.add(123);
        listOfAnyObjects2.add("Another text");
        listOfAnyObjects2.add(new Food());

        List<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(new Food());
        listOfProducts.add(new Drink("Tea"));

        List<?> listOfUnknownType = listOfProducts; // nada se puede agregar a esta lista, excepto null

        //listOfUnknownType.add(new Drink()); // no se puede
        //listOfUnknownType.add(new Object()); // no se puede

        listOfUnknownType.add(null); // solo null es permitido

        Object item = listOfUnknownType.get(0);
        System.out.println("First item is a: " + item.getClass().getSimpleName());
        item = listOfUnknownType.get(1);
        System.out.println("Second item is a: " + item.getClass().getSimpleName());
        item = listOfUnknownType.get(2);
        //System.out.println("Third item is a: " + item.getClass().getSimpleName());

        //List<?> es covariante, pero solo para lectura, no escritura (excepto null).
    }
}
