package src.Task21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.format.ResolverStyle;
import java.util.Locale;

public class DateFormatterUtil {

    private static final Locale RU = new Locale("ru", "RU");
    private static final Locale EN = Locale.ENGLISH;

    public static String currentDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", RU);
        return LocalDate.now().format(formatter);
    }

    public static String currentDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy, h:mm:ss a", EN);
        return LocalDateTime.now().format(formatter);
    }

    public static LocalDateTime parseTask3(String input) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd : hh:mm:ss a", EN);
        return LocalDateTime.parse(input, formatter);
    }

    public static LocalDateTime parseTask4(String input) {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("E dd.MM.yy 'г.' 'время:' HH:mm:ss")
                .toFormatter(RU)
                .withResolverStyle(ResolverStyle.SMART);
        return LocalDateTime.parse(input, formatter);
    }

    public static String currentDateTimeTask5() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendText(java.time.temporal.ChronoField.DAY_OF_WEEK, TextStyle.FULL)
                .appendLiteral(" ")
                .appendPattern("d MMMM yyyy 'время:' hh.mm.ss a")
                .toFormatter(RU)
                .withLocale(RU);

        return LocalDateTime.now().format(formatter);
    }
}
