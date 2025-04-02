package pe.joedayz.intro;

/**
 * @author josediaz
 **/
public class TiposPrimitivos {

  boolean active;
  int a, b, c, d=5;

  public static void main(String[] args) {
    //int i = (int)3_147_900_456; no compila
    //stackoverflow
    int s = (int)0L;
    int cont;
    int binario = 0b1001;
    System.out.println(binario);
    int octal = 072;
    System.out.println(octal);
    int hexadecimal = 0x4F; // A = 10, B =11, C =12...F=15
    System.out.println(hexadecimal);
    double salario = 1234.5678;
    float value = 1234.56F;
    int x=0, y=0, z=0;
    System.out.println(x);

    TiposPrimitivos t = new TiposPrimitivos();
    System.out.println(t.a);

    long aa = 5;
    float fval = 3.5f;
    var suma = fval + aa;
    System.out.println(suma);

    short s1 = 1;
    byte b1 = 1;
    var sumaEnteros = s1 + b1;
    System.out.println(sumaEnteros);

    char e = '\u0041';
    System.out.println(e);
    char f = 'A';
    System.out.println(f);
    char g = '\101';
    System.out.println(g);
    //char h = "a";
//    char j = 'AB';
    boolean status = false;

    short zzzz = (short)45000;  // -32768..32767
    System.out.println(zzzz);

    int k = 5;
    System.out.println(k++);

    System.out.println(--k);

    System.out.println(+5);
    System.out.println(-3);
    System.out.println(~6);
    System.out.println(!status);

    System.out.println(3 + 3 * 6 - 15/5);

    Number a = 123;
    System.out.println(a instanceof Double);

    boolean canHop = false;
    boolean canSwim = false;
    if(canHop & canSwim){
      System.out.println("& ==> true");
    }else{
      System.out.println("& ==>  false");
    }

    String cadena = null;


    if(canHop ^ canSwim){
      System.out.println("^ ==> true");
    }else {
      System.out.println("^ ==> false");
    }

    int aaa = 5;

    if(cadena!=null && ++aaa>3){
      System.out.println(aaa);
    }
    System.out.println(aaa);

    short aes = 5;
    //short rpta = aes + 5;

    aes +=5;

    aes = (short)(aes + 5);

//    aes += 1; // aes = (short)(aes + 1)
//    System.out.println(aes);
    int postNumber = 5;
    System.out.println(++postNumber);
    System.out.println("Que valor tiene postnumber =" + postNumber);

    int v = 5;
//    int w = 6;
//    v = w++;
//    System.out.println(v);
//    System.out.println(w);

    v = v++;
    System.out.println(v);

    byte ba = 120, bb=5;
    byte bite =  (byte)(ba + bb);
    System.out.println(bite);

    bite = (byte)(12 + bb);  // -128 a 127

    short shortVal = (short)(45000 + bb);
    System.out.println(shortVal);

  }
}
