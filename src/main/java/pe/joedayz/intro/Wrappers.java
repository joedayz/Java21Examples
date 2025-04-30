package pe.joedayz.intro;

/**
 * @author josediaz
 **/
public class Wrappers {

  //byte
  //short
  //int

  public static void main(String[] args) {
    int a = 42;
    Integer b = Integer.valueOf(a);
    System.out.println(a==b); //autounboxing
    int c = b.intValue();
    b = a; //autoboxing
    c = b; //autounboxing

    String d = "12.25";
    Float e = Float.valueOf(d);
    float f = e.floatValue();
    float f2 = Float.parseFloat(d);

    String g = String.valueOf(a);

    System.out.println(Short.MIN_VALUE);
    System.out.println(Short.MAX_VALUE);

    System.out.println(Byte.MIN_VALUE);
    System.out.println(Byte.MAX_VALUE);


  }
}
