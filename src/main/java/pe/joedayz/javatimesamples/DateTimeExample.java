package pe.joedayz.javatimesamples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeExample {

    public static void main(String[] args) {
        // Primer bloque
        LocalDate today = LocalDate.now();
        LocalTime thisTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        LocalDate someDay = LocalDate.of(2019, Month.APRIL, 1);
        LocalTime someTime = LocalTime.of(10, 6);
        LocalDateTime otherDateTime = LocalDateTime.of(2019, Month.MARCH, 31, 23, 59);
        LocalDateTime someDateTime = someDay.atTime(someTime);
        LocalDate whatWasTheDate = someDateTime.toLocalDate();

        System.out.println("today = " + today);
        System.out.println("thisTime = " + thisTime);
        System.out.println("currentDateTime = " + currentDateTime);
        System.out.println("someDay = " + someDay);
        System.out.println("someTime = " + someTime);
        System.out.println("otherDateTime = " + otherDateTime);
        System.out.println("someDateTime = " + someDateTime);
        System.out.println("whatWasTheDate = " + whatWasTheDate);
    }
}
