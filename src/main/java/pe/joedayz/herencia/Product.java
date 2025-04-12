package pe.joedayz.herencia;

import java.math.BigDecimal;

public class Product {
    private int id;
    private String name;
    private BigDecimal price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void metodoProduct(){}

    public static void main(String[] args) {

          Object x1 = new Food();
         //x1.metodoFood();

          Product p1 = new Food();
          p1.metodoProduct();
          p1.getId();

          Product p2 = new Drink();
          //p2.metodoDrink();

          //Drink d1 = (Drink) new Product(); CLASSCASTEXCEPTION


//        Product p1 = new Drink();
//        Product p2 = new Food();
//        System.out.println(p1.equals(p2));
//        System.out.println(p1==p2);
//
//        String s1 = "abc";
//        String s2 = new String("abc");
//        System.out.println(s1.equals(s2));
//        System.out.println(s1==
//        Food f = new Food();
//        f.getId();



    }

}
