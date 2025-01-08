package s11_regex;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //a
        System.out.println("DTC123".matches("DTC[0-9]{3}"));
        System.out.println("DTC123".matches("DTC\\d{3}"));

        //b
        System.out.println("+8409847323".matches("[+][(](0|84)[)]3[2-9][0-9]{7}"));

        //c
        System.out.println("Pham_Duy_Truyen_2003@gmail.com".matches("[a-zA-Z0-9_]{6,32}[@]gmail[.]com"));

        //d
        System.out.println("Pham_DuyTruyen.".matches("[a-zA-Z0-9_.]{6,32}"));
    }
}
