package pe.joedayz.records;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product("Tea Red", 1.99);
        Product p2 = new Product("Tea Green", 2.99);

        boolean same = p1.equals(p2);
        int hashCode = p1.hashCode();
        String name = p1.name();
        String text = p1.toString();

        System.out.println("Are they the same? " + same);
        System.out.println("HashCode: " + hashCode);
        System.out.println("Name: " + name);
        System.out.println("Text: " + text);

        System.out.println("Etiqueta: " + p1.etiqueta());
        System.out.println("Precio con 10% de descuento: " + p1.aplicarDescuento(10));

        var obj = new Delivery(p1, LocalDateTime.now());
        //Pattern matching - 1er. intento
        if( obj instanceof Delivery d){
            System.out.println(d.product().name() + " " + d.product().price()
                    + " " + d.time());
        }
        //Pattern matching - 2do. intento
        if( obj instanceof Delivery(Product(var n, var p), var t)){
            System.out.println(n + " " + p
                    + " " + t);
        }
    }
}

