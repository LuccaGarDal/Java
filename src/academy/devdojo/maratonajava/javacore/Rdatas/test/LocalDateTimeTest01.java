package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2025-01-25");
        LocalTime time = LocalTime.parse("09:50:11");
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime ldt1 = time.atDate(date);
        LocalDateTime ldt2 = date.atTime(time);
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
