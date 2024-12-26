package ss1_java_overview.fraction_handling;

import java.util.Scanner;

public class Fraction {
    int tuSo;
    int mauSo;

    public void inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tử số: ");
        tuSo = sc.nextInt();

        do {
            System.out.println("Nhập vào mẫu số (khác 0): ");
            mauSo = sc.nextInt();
            if (mauSo == 0) {
                System.out.println("Mẫu số phải khác 0 !!!");
            }
        } while (mauSo == 0);
    }

    public void Xuat() {
        rutGon();
        if (mauSo == 1) {
            System.out.println(tuSo);
        } else {
            System.out.println(tuSo + "/" + mauSo);
        }
    }

    void rutGon() {
        int ucln = uocChungLonNhat(Math.abs(tuSo), Math.abs(mauSo));
        tuSo /= ucln;
        mauSo /= ucln;

        if (mauSo < 0) { // Đảm bảo mẫu số luôn dương
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }

    int uocChungLonNhat(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public Fraction cong(Fraction fr) {
        Fraction tong = new Fraction();
        tong.tuSo = this.tuSo * fr.mauSo + this.mauSo * fr.tuSo;
        tong.mauSo = this.mauSo * fr.mauSo;
        tong.rutGon();
        return tong;
    }

    public Fraction tru(Fraction fr) {
        Fraction hieu = new Fraction();
        hieu.tuSo = this.tuSo * fr.mauSo - this.mauSo * fr.tuSo;
        hieu.mauSo = this.mauSo * fr.mauSo;
        hieu.rutGon();
        return hieu;
    }

    public Fraction nhan(Fraction fr) {
        Fraction tich = new Fraction();
        tich.tuSo = this.tuSo * fr.tuSo;
        tich.mauSo = this.mauSo * fr.mauSo;
        tich.rutGon();
        return tich;
    }

    public Fraction chia(Fraction fr) {
        if (fr.tuSo == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        Fraction thuong = new Fraction();
        thuong.tuSo = this.tuSo * fr.mauSo;
        thuong.mauSo = this.mauSo * fr.tuSo;
        thuong.rutGon();
        return thuong;
    }

    public boolean phanSoDuong() {
        return tuSo * mauSo > 0;
    }

    public boolean phanSoKhong() {
        return tuSo == 0;
    }
}
