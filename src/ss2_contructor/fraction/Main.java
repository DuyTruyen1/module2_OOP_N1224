package ss2_contructor.fraction;

public class Main {
    public static void main(String[] args) {
        Fraction a = new Fraction();
        a.Xuat();
        Fraction b = new Fraction(1,2);
        b.Xuat();
        Fraction c = new Fraction(5);
        c.Xuat();
        Fraction d = new Fraction(-4,2);
        d.Xuat();
        Fraction e = new Fraction(3,-1);
        e.Xuat();
        Fraction f = e.copy();
        f.cong(10);
    }
}
