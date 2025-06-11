package pe.joedayz.primitivos;

public class Main {
    //variables de instancia ( si tienen valor x defecto)


    public void play(){
        //variables locales (no tienen valor x defecto)
        //byte a;
        //byte b  = a;

        byte b = 12; //-128 a 127
        //int a = 4L;

    }

    public static void main(String[] args) {
//        int a = 4;
//        System.out.println(++a);

        byte a = 127, b = 5;
        int d = a + b; //tipos pequeños se promueven a tipo grande

        float g = a/b;

        short x = (short)(a + 5 + b);  // -32768, 32767

        float f =  (float) (a + 5.0 + b);

        byte w = 3 ; short s = 5; int i = 7;
        int l = w + s + i;

        System.out.println(g);
    }
}
