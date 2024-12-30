package ss3_static.localdate_util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String inputDate_ddMMyyyy = "25/12/2015";
        String inputDate_yyyyMMdd = "2022/08/15";

        DateTimeFormatter formatter_ddMMyyyy = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter_yyyyMMdd = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        LocalDate parsedDate_ddMMyyyy = LocalDate.parse(inputDate_ddMMyyyy, formatter_ddMMyyyy);
        LocalDate parsedDate_yyyyMMdd = LocalDate.parse(inputDate_yyyyMMdd, formatter_yyyyMMdd);

        System.out.println("Input in dd/MM/yyyy: " + inputDate_ddMMyyyy + " => LocalDate: " + parsedDate_ddMMyyyy);
        System.out.println("Input in yyyy/MM/dd: " + inputDate_yyyyMMdd + " => LocalDate: " + parsedDate_yyyyMMdd);

        LocalDate currentDate = LocalDate.now();

        String formattedCurrentDate_ddMMyyyy = currentDate.format(formatter_ddMMyyyy);
        String formattedCurrentDate_yyyyMMdd = currentDate.format(formatter_yyyyMMdd);

        System.out.println("Current date (format dd/MM/yyyy): " + formattedCurrentDate_ddMMyyyy);
        System.out.println("Current date (format yyyy/MM/dd): " + formattedCurrentDate_yyyyMMdd);
    }
}
