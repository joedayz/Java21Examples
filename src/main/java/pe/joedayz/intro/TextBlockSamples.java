package pe.joedayz.intro;

/**
 * @author josediaz
 **/
public class TextBlockSamples {

  public static void main(String[] args) {
    String basicText = "Tea\tprice 1.99 quantity 2\n\"English Breakfast\"\n";

    String textBlock = """
        Tea price 1.99 quantity 2
        "English Breakfast"
        """;

    //System.out.println(basicText);
    System.out.println(textBlock);

    //int p1 = basicText.indexOf("price");
    int p2 = textBlock.indexOf("price");
    System.out.println(p2);
  }
}
