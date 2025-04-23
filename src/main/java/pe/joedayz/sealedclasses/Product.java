package pe.joedayz.sealedclasses;

public abstract sealed class Product permits Food, Drink {

    public static void main(String[] args) {
        System.out.println(new pe.joedayz.sealedclasses.Food());
    }
}

//class Other extends Product{
//
//}