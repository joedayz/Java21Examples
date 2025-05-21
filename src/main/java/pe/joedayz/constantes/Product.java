package pe.joedayz.constantes;

public class Product {

    private final int id;
    private final String name;

    { id = 0;}  //bloque de inicializacion de instancia

    public Product(int id, String name) { //constructor
        this.name = name;
    }
}
