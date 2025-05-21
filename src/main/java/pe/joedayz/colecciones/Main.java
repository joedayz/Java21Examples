package pe.joedayz.colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    List<Product> productList = new ArrayList<>();

    List<Product> productListB = new ArrayList<>(20);

    public static void main(String[] args) {
        Main main = new Main();

//        main.productList.add(4, new Product());
//        main.productList.add(5, new Product());

        //main.productListB.add(4, new Product());


        Map<String, Integer> edades = Map.of(
                "José", 30,
                "Ana", 28,
                "Luis",15
        );

        System.out.println(edades);
        //edades.put("José", 50);


        Map<String, String> capitales = Map.ofEntries(
                Map.entry("Perú", "Lima"),
                Map.entry("Chile", "Santiago"),
                Map.entry("Argentina", "Buenos Aires"),
                Map.entry("Ecuador", "Quito")
        );

        System.out.println(capitales);
    }
}
