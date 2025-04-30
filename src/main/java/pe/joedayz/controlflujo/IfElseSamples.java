package pe.joedayz.controlflujo;

public class IfElseSamples {

    public static void main(String[] args) {
        int a = 2, b = 3;
        if (a>b){
            a--;
        }else{
            if(a<b){
                a++;
            }else{
                b++;
            }
        }

        System.out.println(a);
        System.out.println(b);

        int x = 2, y = 3;
        int z = (x>=y) ? x : y;
        System.out.println(z);

        int a1 = 2, b1 = 3;
        int c1 = (a1>=b1) ? a1 : (--b1 == a1)? a1: b1; //warning
        System.out.println(c1);
    }
}
