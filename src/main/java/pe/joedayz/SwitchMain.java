package pe.joedayz;

/**
 * @author josediaz
 **/
public class SwitchMain {

  public static void main(String[] args) {

    char ch = 'z';
    switch (ch) {
      case 'a':
        System.out.println("Hello");
      case 'b':
        System.out.println("Java");
      default:
        System.out.println(".");
      case 'c':
        System.out.println("Guys");

    }
    long lVal = 10L;
//
//  }    switch (lVal){

    String cadena = "abc";
    switch (cadena){
      case "a":
    }

    Object obj = new Object();
    switch(obj){
      default: break;
    }

    char status = 'N';
    double cost = 10;
    double respuesta = switch (status){
            case 'S','N' -> cost +=1;
            case 'D' -> {
              double discount = 0.20;
              cost = cost - cost*discount;
              yield cost;
            }
          default -> cost;
        };

  }
}
