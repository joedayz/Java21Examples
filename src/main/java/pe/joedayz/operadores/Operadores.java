package pe.joedayz.operadores;

public class Operadores {

    public static void main(String[] args) {

//        int a = 3, b = 2;
//
//        int l = Math.round(a/b); // long, double, float  =
//
//        long d = Math.round((double)a/b);
//
//        int x = 2;
//        int y = ~x;  //-3 =   -(x)-1 =  -(2)-1 = -3
//        System.out.println("y = " + y);

        int a = 3, b = 2;
        boolean c = false;

        c = (a == b);
        System.out.println("c = (a == b): " + c);

        c = !(a == b);                     // true
        System.out.println("c = !(a == b): " + c);

        c = (a != b);                      // true
        System.out.println("c = (a != b): " + c);

        c = (a > b);                       // true
        System.out.println("c = (a > b): " + c);

        c = (a >= b);                      // true
        System.out.println("c = (a >= b): " + c);

        c = (a < b);                       // false
        System.out.println("c = (a < b): " + c);

        c = (a <= b);                      // false
        System.out.println("c = (a <= b): " + c);

        c = (a > b && b == 2);             // true
        System.out.println("c = (a > b && b == 2): " + c);

        c = (a < b || b == 2);             // true
        System.out.println("c = (a < b || b == 2): " + c);


        c = (a > b ^ b == 2);              // false (true ^ true = false)
        System.out.println("c = (a > b ^ b == 2): " + c);





    }
}
