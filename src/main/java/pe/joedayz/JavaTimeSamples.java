package pe.joedayz;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author josediaz
 **/
public class JavaTimeSamples {
//
//  public static void main(String[] args) {
//    Instant start = Instant.now();  //el instante actual
//
//    for (int i = 0; i < 1_000_000; i++)
//      ;
//
//    Instant end = Instant.now();
//
//    System.out.println("Tiempo de ejecucion en ms: " + Duration.between(start, end).toMillis());
//    System.out.println(
//        "Otra forma de TE en ms: " + (end.toEpochMilli() - start.toEpochMilli()) + " ms");
//}

//  public static void main(String[] args) {
//    //Duration para diferencias de tiempo en horas, minutos , segundos
//    Instant start = Instant.now();
//
//    try{
//      Thread.sleep(2000);
//    }catch (InterruptedException e){ e.printStackTrace(); }
//
//    Instant end = Instant.now();
//    Duration duration = Duration.between(start, end);
//
//    System.out.println("Duracion en segundos: " + duration.getSeconds());
//
//  }

  public static void main(String[] args) {
    //Period es para diferencias de tiempo en dias, meses, años
    LocalDate birthday = LocalDate.of(1974, 11, 6);
    LocalDate today = LocalDate.now();

    Period period = Period.between(birthday, today);
    System.out.println("Edad: " + period.getYears() + " años, " + period.getMonths() + " mes, "
        + period.getDays());

  }
}
