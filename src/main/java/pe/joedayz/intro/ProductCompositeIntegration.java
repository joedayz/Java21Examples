package pe.joedayz.intro;

import java.math.BigDecimal;

/**
 * @author josediaz
 **/
public class ProductCompositeIntegration {

  static final double NUMERO_PI = 3.14159;
  boolean active;
  BigDecimal price;
  //short 2abc;
  String $name;
  int _quantity;

  String __;

  public ProductCompositeIntegration(boolean active, BigDecimal price) {
    this.active = active;
    this.price = price;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }
}
