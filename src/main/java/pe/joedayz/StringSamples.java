package pe.joedayz;

/**
 * @author josediaz
 **/
public class StringSamples {

  public static void main(String[] args) {
    String a = "Hello";
    String b = a;
    String c = "Hello";
    String d = new String("Hello");


//    String e = d.intern(); // usa el "Hello" del pool de Strings
//
//    String f = new String("Hello");
//    f = f + " World";
//
//
    System.out.println(a==b);
    System.out.println(a==c);
    System.out.println(b==c);
    System.out.println(c==d); //los 2 estan apuntando al mismo objeto?
    System.out.println(c.equals(d)); //los 2 tienen los mismo caracteres
//
//    System.out.println(a==e);
//
//    String x = "  Hello ";
//    x = x.trim();
//    String y = x.concat(" World");
//    System.out.println(y);
//    String z = x + " World";
//    System.out.println(z);
//    System.out.println(y==z);
//    String w = z.toLowerCase();
//    System.out.println(w);
//
//    String s = "";
//    s = 1 + 1 + "u";
//    System.out.println(s);
//    s = "u" + 1 + 1;
//    System.out.println(s);

  }

}
