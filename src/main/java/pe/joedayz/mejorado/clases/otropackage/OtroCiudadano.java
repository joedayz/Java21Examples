package pe.joedayz.mejorado.clases.otropackage;

import pe.joedayz.mejorado.clases.Padre;

public class OtroCiudadano {

    public static void main(String[] args) {
        Padre padre = new Padre();
        //padre.value = 5.60; //NO COMPILA PORQUE ES PROTECTED
        padre.status = true;
        //padre.play(); NO COMPILA PORQUE ES PROTECTED
    }
}
