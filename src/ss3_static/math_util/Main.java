package ss3_static.math_util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập vào số b: ");
        double b = sc.nextDouble();

        double sum = MathUtil.add(a, b);
        double difference = MathUtil.subtract(a, b);
        double prduct = MathUtil.multiply(a, b);
        double quotient = MathUtil.divide(a, b);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + prduct);
        System.out.println("Quotient: " + quotient);


    }
}
