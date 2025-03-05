package pe.joedayz;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

/**
 * @author josediaz
 **/
public class Product {

  //variables de instancia - valor por defecto
  private int id;  //0
  private final BigDecimal price = BigDecimal.ZERO;  //null
  private final String name = "Tea";  //null
  private LocalDate bestBefore = LocalDate.now().plusDays(3);
  private boolean active; //false
 // private var String cadena;
  private static Period defaultExpiryPeriod = Period.ofDays(3);

  public static void setDefaultExpiryPeriod(Period defaultExpiryPeriod) {
    Product.defaultExpiryPeriod = defaultExpiryPeriod;

  }


  public static void main(String[] args) {
    System.out.println(Product.defaultExpiryPeriod);
    Product.setDefaultExpiryPeriod(defaultExpiryPeriod);

//    Product p1 = new Product();
//    p1.getDiscount(BigDecimal.ONE);
//    p1.setDefaultExpiryPeriod(defaultExpiryPeriod);

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
//
//  public static void main(String[] args) {
////    Product product = new Product();
////    product.setPrice(BigDecimal.valueOf(100));
////    System.out.println(product.getPrice());
//     new Product();
//     final Product p1 = new Product();
//     final Product p2 = new Product();
//     Product p3 = p2;
////     p1.setName("Tea");
////     p2.setName("Cake");
//    System.out.println(p1.getName());
//    System.out.println(p2.getName());
//    System.out.println(p3.getName());
//
//  }


}
