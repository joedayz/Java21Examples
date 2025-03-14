package pe.joedayz.b;

import pe.joedayz.a.X;

/**
 * @author josediaz
 **/
public class Y extends X {

  public void doThings(){
    Y y = new Y();
    y.m1 = "m1";
    y.m2 = "m2";
    //y.m3 = "error";
    //z.m4 = "error";
    X x = new X();
    x.m1 = "m1";
    //x.m2 = "error" //Yo "Y" no estoy en el mismo paquete
  }
}
