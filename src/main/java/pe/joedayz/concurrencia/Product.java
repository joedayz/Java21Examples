package pe.joedayz.concurrencia;

public class Product {

    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Para facilitar la impresión
    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "'}";
    }
}
