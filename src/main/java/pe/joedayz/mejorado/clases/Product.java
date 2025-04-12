package pe.joedayz.mejorado.clases;

import java.math.BigDecimal;
import java.security.PrivateKey;

public class Product {
    private static int maxId = 0;
    private final int id;
    private final String name;
    private BigDecimal price;
    private BigDecimal discount;
    private BigDecimal tax;

    {
        id = ++maxId;
    }

    public Product(BigDecimal price, BigDecimal discount) {
        this("Iphone"); // La primera linea es para llamar a otro constructor
        this.price = price;
        this.discount = discount;
        this.tax = BigDecimal.valueOf(0.10);

    }

    public Product(BigDecimal price, BigDecimal discount, BigDecimal tax) {
        this("Iphone"); // La primera linea es para llamar a otro constructor
        this.price = price;
        this.discount = discount;
        this.tax = tax;

    }

    public Product(String name){
        //this(BigDecimal.valueOf(10.99), BigDecimal.valueOf(0.99), BigDecimal.valueOf(0.10)); LOOP ERROR
        this.name = name;
    }

//    public Product() {
//
//    }



    public Product(){
        this.name = "Iphone";
    }

    public static void main(String... args) {
        Product product = new Product();
        product.setFiscalDetails();
        product.setFiscalDetails(1.99);
        product.setFiscalDetails(1.99, 0.9);
        product.setFiscalDetails(1.99, 0.9, 0.1);
        product.setFiscalDetails(new double[]{ 1.99, 0.9, 0.1});
    }

//    public void play(int... count, double ...values){ NO COMPILA
//
//    }
//
    public void play(int count, double ...values){

    }

    public void setFiscalDetails(double ...values){
        switch (values.length) {
            case 3:
                tax = new BigDecimal(values[2]);
            case 2:
                discount = new BigDecimal(values[1]);
            case 1:
                price = new BigDecimal(values[0]);
        }
    }


    public void setPrice(double price) {
        this.price = BigDecimal.valueOf(price);
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setPrice(BigDecimal price, BigDecimal discount) {
        this.price = price;
        this.discount = discount;
    }


}
