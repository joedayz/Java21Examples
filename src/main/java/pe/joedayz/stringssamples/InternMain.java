package pe.joedayz.stringssamples;

public class InternMain {

    public static void main(String[] args) {
        String s1 = new String("JoeDayz");
        String s2 = s1.intern();

        System.out.println(s2);
    }
}
