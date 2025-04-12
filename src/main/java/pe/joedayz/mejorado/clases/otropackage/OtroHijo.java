package pe.joedayz.mejorado.clases.otropackage;

import pe.joedayz.mejorado.clases.Padre;

public class OtroHijo extends Padre {

    public static void main(String[] args) {
        //NO PUEDES HACER ESTO
        //Padre padre = new Padre();
        //padre.value = 5.6;

        //SI SE PUEDE HACER
        OtroHijo otroHijo = new OtroHijo();
        otroHijo.value = 1.0;
        otroHijo.play();
    }
}
