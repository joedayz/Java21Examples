package pe.joedayz.varargs;

public class Product {


    public void setFiscalDetails(double ...value){

    }

    public static void main(String[] args) {
        new Product().setFiscalDetails();
        new Product().setFiscalDetails(10.0, 5.0);
        new Product().setFiscalDetails(new double[] {10.0, 5.0});

        System.out.println(new Product());

        pe.joedayz.modificador.acceso.Product p1 = new pe.joedayz.modificador.acceso.Product();
        pe.joedayz.modificador.acceso.Product p2 = new pe.joedayz.modificador.acceso.Product();

        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
    }
}
