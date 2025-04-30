package pe.joedayz.operadores;

public class Booleanos {

    public static void main(String[] args) {
        byte a = 5;  // 00000101
        byte b = 3;  // 00000011

        byte c = (byte)(a & b);  //and 1
        System.out.println(c);

        byte d = (byte)(a | b); // 111  7
        System.out.println(d);

        byte e = (byte)(a ^ b); // xor es 6
        System.out.println(e);

        int x = 3 , y = 2;
        boolean z = false;
        z = (x == y);  //false
        System.out.println(z);
        z = !(x == y); //true
        System.out.println(z);
         z = (x > y);
        System.out.println(z);
         z = (x <= y);
        System.out.println(z);

        z = (x > y && y == 2);
        System.out.println(z);

        System.out.println("antes: " + y);

        z = (x < y &&  (++y>5));

        System.out.println("despues:" + y);



    }
}
