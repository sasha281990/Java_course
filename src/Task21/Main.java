package src.Task21;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        System.out.println("1) " + DateFormatterUtil.currentDate());

        System.out.println("2) " + DateFormatterUtil.currentDateTime());

        String s3 = "2023-03-19 : 10:12:24 AM";
        LocalDateTime dt3 = DateFormatterUtil.parseTask3(s3);
        System.out.println("3) " + dt3);

        String s4 = "пн 20.03.23 г. время: 15:07:28";
        LocalDateTime dt4 = DateFormatterUtil.parseTask4(s4);
        System.out.println("4) " + dt4);

        System.out.println("5) " + DateFormatterUtil.currentDateTimeTask5());
    }
}