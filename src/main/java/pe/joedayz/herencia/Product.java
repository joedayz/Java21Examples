package pe.joedayz.herencia;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Product {
    private int id;
    private String name;
    private BigDecimal price;
    private BigDecimal discount;

    {
        System.out.println("4.1. Inicializando instancia product...");
    }


    {
        System.out.println("4.2. Inicializando instancia product...");
    }

    static {
        System.out.println("2. Static Inicializando product ...");
    }

    public Product(String name){
        this.name = name;
    }

    public void order(Product product) {
        if(product instanceof Food f && f.getBestBefore().isBefore(LocalDateTime.now())) {

        }
        //if(product instanceof Food f || f.getBestBefore().isBefore(LocalDateTime.now())) {}
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

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



    {
        System.out.println("4.3. Inicializando instancia product...");
    }
}
