package pe.joedayz.modificador.otro;

import pe.joedayz.modificador.acceso.Product;

public class Food extends Product {

    public static  void  main(String[] args) {
        Food food = new Food();
        food.name = "Ceviche de Pescado";
        System.out.println(food.name);

    }
}
