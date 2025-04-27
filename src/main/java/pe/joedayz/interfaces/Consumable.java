package pe.joedayz.interfaces;

public interface Consumable {

    double PI = 3.1415169; //asi no lo veas, es public static final

    void consume();  //asi no veas el public, el metodo siempre es public y abstract

    //metodos privados
    private void bin(){}

    //metodos staticos
    static void baz(){}

    //metodos default
    default void play(){}

    // I = Cimplementa
    Consumable c = new Food();
    //Consumable c2 = new Figure(); NO COMPILA
}

interface Lovable {
    default void play(){}
}

class Figure {}

class Food  implements Consumable, Lovable {
    @Override
    public void consume() {

    }

    @Override
    public void play() {

    }
}