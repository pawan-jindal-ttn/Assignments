package Ques6;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Prog2 {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy - HH:mm:ss");

        ZonedDateTime zone1 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime zone2 = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime zone3 = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println(zone1.format(formatter) + "\n" + zone2.format(formatter) + "\n" + zone3.format(formatter));
    }
}
