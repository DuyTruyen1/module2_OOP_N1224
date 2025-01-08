package s11_regex;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.print("Vui lòng nhập điện thoại cũ với mã DTCXXXXX (với XXX là số): ");
        input = sc.nextLine();

//        System.out.println(input.matches("DTC[0-9]{3}"));
        System.out.println(input.matches("^(0|\\+84)(3[2-9])\\d{7}$"));

//        System.out.println("0351234567".matches("([(]\\+84[)]"));

    }
}
