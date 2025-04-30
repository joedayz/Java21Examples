package pe.joedayz.intro;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

import static java.lang.Math.random;

//import java.lang.*;
/**
 * @author josediaz
 **/
public class Product {

  //variables de instancia - valor por defecto
  private int id;  //0
    public static final int MAX_EXPITY_PERIOD = 5;
  private final BigDecimal price = BigDecimal.ZERO;  //null
  private final String name = "abc";  //null
  private LocalDate bestBefore = LocalDate.now().plusDays(3);
  private boolean active; //false
    private  String cadena; //null
  private static Period defaultExpiryPeriod = Period.ofDays(3);

//    {
//        name  = "Abc";
//    }

//
//    public Product(String name) {
//        this.name = name;
//    }

    public static void setDefaultExpiryPeriod(Period defaultExpiryPeriod) {
    Product.defaultExpiryPeriod = defaultExpiryPeriod;

  }


  public static void main(String[] args) {
    System.out.println(Product.defaultExpiryPeriod);
    Product.setDefaultExpiryPeriod(defaultExpiryPeriod);

    Product p1 = new Product();
    p1.getDiscount(BigDecimal.ONE);
    p1.setDefaultExpiryPeriod(defaultExpiryPeriod);

    Product p2 = new Product();
    Product p3 = new Product();
    Product p4 = new Product();

      System.out.println(Product.defaultExpiryPeriod); //la forma comun de llamar a un static

      System.out.println(p4.defaultExpiryPeriod); //no es la forma comun - NO ES BUENA PRACTICA

      System.out.println(Product.MAX_EXPITY_PERIOD);

      System.out.println(random());
  }

  public void someOperation(int param){
      var value1 = "hello"; //infiere que es String
      var value2 = param; //infiere es int
        //static var i = 5;
  }

  //Bloque de iniciacion de instancia
//  {
//    name = "Coffee";
//  }

//constructor
//  public Product(String name) {
//    this.name = name;
//  }

  public BigDecimal getDiscount(final BigDecimal discount){
    return price.multiply(discount);
  }


  public BigDecimal getPrice() {
    return price;
  }

//  public void setPrice(BigDecimal price) {
//    this.price = price;
//  }

  public String getName() {
    if(name==null){
      var dummy = "Unknown";
      return dummy;
    }


    {
      String teen = "Teen";
    }


    return name;
  }

//  public void setName(String name) {
//    this.name = name;
//  }

  public String consume(){
    String feedback = "Good!";
    return feedback;
  }


}
