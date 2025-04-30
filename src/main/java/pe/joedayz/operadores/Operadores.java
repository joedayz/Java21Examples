package pe.joedayz.operadores;

public class Operadores {

    public static void main(String[] args) {
//        int a = 1;
//        int b = a + 4;
//        int c = b - 2;
//        int d = c * b;
//        int e = d / c;
//        int f = d % e;

//        int a = 1, b = 3;
//
//        a += b;
//        a -=b;
//        a /=2;
//        a %= a;

//        int a = 2, b = 3;
//        int c = b - a * b;
//        System.out.println(c);
//

        int a = 1, b = 3;
        a++; //post increment
        //a es 2
        ++a; //pre increment
        //a es 3

        b = a++; // b es 3
        System.out.println(b);
        System.out.println(a); //4

        b = --a; //a = 3 b = 3
        System.out.println(b);
        System.out.println(a);

        // byte, short, int , long, float, double
        // char y boolean
        byte a1 = 50, b1 = 5;  //-128 a 127

        byte c1 = (byte)(a1 + b1);


        float g = a1/b1;

        int x = 2;
        int y = ~x;

        System.out.println(y); //bitwise complement  -(x+1)



    }
}
