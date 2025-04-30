package pe.joedayz.intro;

/**
 * @author josediaz
 **/
public class StringBuilderSamples {

  public static void main(String[] args) {
    StringBuilder sb1 = new StringBuilder(); // tiene una capacidad por defecto de 16
    StringBuilder sb2 = new StringBuilder(100);
    StringBuilder sb3 = new StringBuilder("abc");

    sb3.append("def");
    sb3.append("ghi");
    sb3.append("jkl");
    sb3.append("mno");
    System.out.println(sb3);

    sb1.append("tea");
    sb1.append('s');
    sb1.insert(3, 'm');
    sb1.delete(2, 4);
    sb1.reverse();
    System.out.println(sb1);
  }
}
