package pe.joedayz.stringssamples;

public class StringSamples {

    public static void main(String[] args) {

        var start = "Perusalen    ";
        var trimmed = start.trim();
        var lowercase = trimmed.toLowerCase();
        var result = lowercase
                .replaceAll("u", "U");
        System.out.println(result);

        String result2 =
                "Perusalen".trim()
                        .toLowerCase()
                        .replace('u', 'U');

        System.out.println(result2);

        String a = "abc";
        String b = a.toUpperCase();
        b = b.replace('B', '2')
                .replace('C', '3');
        System.out.println(b);












//        var name = "Jose";
//        var edad = 50;
//
//        System.out.println("Hello "+
//                name + ", tu edad es: "
//                + edad);
//        System.out.println(
//                String.format("Hello %s, " +
//                        "tu edad es: %d", name, edad)
//        );
//        System.out.println("Hello %s, tu edad es %d"
//                        .formatted(name, edad));

        //Flag formateo
        //   %s (String)
        //   %d (int, long)
        //   %f (float y double)
        //   %n (inserta un cambio de linea)

//        var str = "Food: %d tons"
//                .formatted(2.0);



//        var pi = 3.141599265359;
//
//        System.out.format("[%f]", pi);
//        System.out.format("[%12.8f]", pi);
//        System.out.format("[%012f]", pi);
//        System.out.format("[%12.2f]", pi);
//        System.out.format("[%.3f]", pi);




//        System.out.println(" ".isEmpty());
//        System.out.println(" \t".isBlank());
//        System.out.println("".isEmpty());
//        System.out.println("".isBlank());
    }
}
