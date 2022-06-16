// Date and Time

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class tut55 {
    public static void main(String[] args) {
        // Number of year passed since 1-Jan-1970
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365);
        System.out.println(Long.MAX_VALUE);

        // Outdates Method
        Date d = new Date();
        System.out.println(d.getTime());

        // System.out.println(d.getSeconds());
        // System.out.println(d.getDate());
        // System.out.println(d.getYear() + 1900);
        // considers that 1900 is starting of world

        // New Method
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Before Formatting : " + ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fsdtf = ldt.format(dtf);
        System.out.println("After Formatting : " + fsdtf);
    }
}
