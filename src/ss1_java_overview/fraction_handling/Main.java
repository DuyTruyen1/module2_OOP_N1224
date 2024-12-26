package ss1_java_overview.fraction_handling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create two Fraction objects
        Fraction fr1 = new Fraction();
        Fraction fr2 = new Fraction();

        System.out.println("Nhập vào phân số thứ nhất:");
        fr1.inputNumber();

        System.out.println("Nhập vào phân số thứ hai:");
        fr2.inputNumber();

        System.out.println("Phân số thứ nhất là:");
        fr1.Xuat();
        System.out.println("Phân số thứ hai là:");
        fr2.Xuat();

        Fraction resultCong = fr1.cong(fr2);
        System.out.println("Kết quả cộng hai phân số: ");
        resultCong.Xuat();

        Fraction resultTru = fr1.tru(fr2);
        System.out.println("Kết quả trừ hai phân số: ");
        resultTru.Xuat();

        Fraction resultNhan = fr1.nhan(fr2);
        System.out.println("Kết quả nhân hai phân số: ");
        resultNhan.Xuat();

        Fraction resultChia = fr1.chia(fr2);
        System.out.println("Kết quả chia hai phân số: ");
        resultChia.Xuat();

        System.out.println("Phân số thứ nhất là phân số dương: " + fr1.phanSoDuong());
        System.out.println("Phân số thứ hai là phân số dương: " + fr2.phanSoDuong());

        System.out.println("Phân số thứ nhất là phân số không: " + fr1.phanSoKhong());
        System.out.println("Phân số thứ hai là phân số không: " + fr2.phanSoKhong());

        sc.close();
    }
}
