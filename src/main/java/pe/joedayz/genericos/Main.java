package pe.joedayz.genericos;

public class Main {

    public static void main(String[] args) {
        Caja<String> cajaDeTexto = new Caja<>();
        cajaDeTexto.guardar("JoeDayz");
        System.out.println(cajaDeTexto.obtener());

        Caja<Integer> cajaDeNumero = new Caja<>();
        cajaDeNumero.guardar(123);
        System.out.println(cajaDeNumero.obtener());

    }
}
