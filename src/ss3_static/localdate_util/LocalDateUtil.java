package ss3_static.localdate_util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateUtil {
    private static final DateTimeFormatter FORMATTER_DD_MM_YYYY = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FORMATTER_YYYY_MM_DD = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public static LocalDate parseToLocalDateFrom_ddMMyyyy(String date) {
        return LocalDate.parse(date, FORMATTER_DD_MM_YYYY);
    }

    public static LocalDate parseToLocalDateFrom_yyyyMMdd(String date) {
        return LocalDate.parse(date, FORMATTER_YYYY_MM_DD);
    }

    public static String formatTo_ddMMyyyy(LocalDate date) {
        return date.format(FORMATTER_DD_MM_YYYY);
    }

    public static String formatTo_yyyyMMdd(LocalDate date) {
        return date.format(FORMATTER_YYYY_MM_DD);
    }
}
