package pe.joedayz.polimorfismo;

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product();
        Drink d1 = new Drink();
        Food f1 = new Food();

        // CP = CI

        Product p2 = new Drink();
        Product p3 = new Food();

        p2.play();
        p3.play();
        //p2.bar(); //NO COMPILA
        //p3.zum(); NO COMPILA
    }
}
