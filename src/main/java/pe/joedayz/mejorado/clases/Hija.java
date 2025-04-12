package pe.joedayz.mejorado.clases;

public class Hija extends Padre{

    public static void main(String[] args) {
        Padre padre = new Padre();
        padre.nombre = "Padre";
        padre.value = 1.0;

        Hija hija = new Hija();
        hija.nombre = "Hija";
        hija.value = 2.0;
        hija.play();
    }
}
