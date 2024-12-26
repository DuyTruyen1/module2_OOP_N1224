package ss2_contructor.time;

public class Main {
    public static void main(String[] args) {
        Time time = new Time();
        time.Xuat();
        Time time2 = new Time(2);
        time2.Xuat();
        Time time3 = new Time(11,30);
        time3.Xuat();
        Time time4 = new Time(9,45,59);
        time4.Xuat();
        Time time5 = new Time(time4);
        time5.Xuat();
    }
}
