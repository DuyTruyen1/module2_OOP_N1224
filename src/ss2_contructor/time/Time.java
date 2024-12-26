package ss2_contructor.time;

public class Time {
    private int gio;
    private int phut;
    private int giay;

    public Time(){}

    public Time(int gio){
        this.gio = gio;
        phut = 0;
        giay = 0;
    }
    public Time(int gio, int phut){
        this.gio = gio;
        this.phut = phut;
        giay = 0;
    }
    public Time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public Time(Time time){
        this.gio = time.gio;
        this.phut = time.phut;
        this.giay = time.giay;
    }

    public void Xuat(){
        System.out.printf("%02d:%02d:%02d\n", gio, phut, giay);
    }
}
