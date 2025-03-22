package pe.joedayz;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author josediaz
 **/
public class LanguageSamples {
//
//  public static void main(String[] args) {
//    Locale peru = new Locale("es", "PE"); // Español - Perú
//    Locale norway = new Locale("no", "NO"); // Noruego - Noruega
//
//    System.out.println("Perú: " + peru.getDisplayCountry() + " - " + peru.getDisplayLanguage());
//    System.out.println("Noruega: " + norway.getDisplayCountry() + " - " + norway.getDisplayLanguage());
//  }

//  public static void main(String[] args) {
//    LocalDate today = LocalDate.now();
//
//    DateTimeFormatter peruFormatter = DateTimeFormatter.ofPattern("EEEE, d 'de' MMMM 'de' yyyy",
//        new Locale("es", "PE"));
//    DateTimeFormatter norwayFormatter = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy",
//        new Locale("no", "NO"));
//
//    System.out.println("Fecha en Perú: " + today.format(peruFormatter));
//    System.out.println("Fecha en Noruega: " + today.format(norwayFormatter));
//
//  }
  public static void main(String[] args) {
    double amount = 12345.67;
    Locale peru = new Locale("es", "PE");
    Locale norway = new Locale("no", "NO");
    NumberFormat peruFormat = NumberFormat.getCurrencyInstance(peru);
    NumberFormat norwayFormat = NumberFormat.getCurrencyInstance(norway);

    System.out.println("Monto en Perú: " + peruFormat.format(amount));
    System.out.println("Monto en Noruega: " + norwayFormat.format(amount));
  }

}
