package pe.joedayz.records;

public record Product(String name, double price) implements Descuento{

    public Product(String name, double price){ //CONVENCIONAL
        //transformaciones
        name = name.toUpperCase();
        price = price * price * price;
        //asignaciones de caracter mandatorio para todos los argumentos
        this.name = name;
        this.price = price;
    }

//    public Product{  //COMPACTO
    //SI PUEDES TRANSFORMAR
//        name = name.toUpperCase();
//        price = price * 2;
            //NO SE HACE LA ASIGNACION
//        //this.name = name; NO COMPILA. Esto ya se hace automaticamente
//        //this.price = price; NO COMPILA. Esto ya se hace automaticamente
//    }



    // Método adicional propio del record
    public String etiqueta() {
        return name.toUpperCase() + " - $" + price;
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return price - (price * porcentaje / 100);
    }
}


// Una interfaz simple
interface Descuento {
    double aplicarDescuento(double porcentaje);
}