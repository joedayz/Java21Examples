

package pe.joedayz.clases;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Animal {


    //variables de instancia y metodos
    private int id;
    private String name;
    private LocalDate birthday = LocalDate.now();
    private final BigDecimal NUMBER_ZERO = BigDecimal.ZERO;
    private static  Period defaulExpiryPeriod ;



    {
        name = "fido";

    }

    static {
        defaulExpiryPeriod = Period.ofYears(60);
        System.out.println("defaulExpiryPeriod=" + defaulExpiryPeriod);
    }

    public static void setDefaulExpiryPeriod(Period defaulExpiryPeriod) {
        Animal.defaulExpiryPeriod = defaulExpiryPeriod;
    }

    public Animal() {
        name = "ragnar";
        //System.out.println(name);
    }

    public void dummy(){
        System.out.println(name);

    }

    public static void play(){
        //System.out.println(name);
    }




    public String getName() {
        if(name==null){
            var dummy = "none";
            return dummy;
        }else{
            return name;
        }

    }

    public void setName(final String name) {
        this.name = name;
    }

    public static void main(String[] args) {




//        Animal animal1 = new Animal();
//        animal1.name = "Fido";
//        System.out.println(animal1.getName());
//
//        Animal animal2 = new Animal();
//        Animal animal3 = animal1;
//
//        var price = 56.70;
//        //var birthday = null;
//        //price = "abc";
//
//        for (var i = 0; i < 10 ; i++) {
//
//        }
//        Animal[] arrayAnimals = new Animal[]{new Animal(), new Animal()};
//
//        for (var a: arrayAnimals){
//
//        }
//
//        /** no es la forma recomendada de llamar a variables y metodos static *//
//
//        animal1.defaulExpiryPeriod = Period.ofYears(50);
//
//
//        System.out.println(animal3.defaulExpiryPeriod);
//
//        animal2.setDefaulExpiryPeriod(Period.ofYears(100));
//
//        /** no es la forma recomendada de llamar a variables y metodos static *//
//
//
//
//        Animal.defaulExpiryPeriod = Period.ofYears(100);
//        Animal.setDefaulExpiryPeriod(defaulExpiryPeriod);

    }


    {
      name = "runrun";

    }

}




