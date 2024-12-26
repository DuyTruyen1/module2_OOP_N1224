package ss2_contructor.fraction;

import java.util.Scanner;

public class Fraction {
    int tuSo;
    int mauSo;

    public Fraction() {
        tuSo = 0;
        mauSo = 1;
    }

    public Fraction(int tuSo) {
        this.tuSo = tuSo;
        mauSo = 1;
    }

    public Fraction(int tuSo, int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mẫu số phải khác 0");
        }
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        rutGon();
    }

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

        if (mauSo < 0) { // Ensure the denominator is always positive
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

    public void cong(int value) {
        tuSo += value * mauSo;
        rutGon();
    }

   public Fraction copy(){
        return new Fraction(this.tuSo, this.mauSo);
   }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mẫu số phải khác 0");
        }
        this.mauSo = mauSo;
    }
}

