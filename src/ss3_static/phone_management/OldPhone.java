package ss3_static.phone_management;

import java.util.Scanner;

public class OldPhone extends Phone {
    private String batteryStatus;
    private int description;

    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Battery Status: ");
        batteryStatus = sc.nextLine();
        System.out.print("Enter Description: ");
        description = sc.nextInt();
    }

    @Override
    public void output(){
        super.output();
        System.out.println("Battery Status: " + batteryStatus);
    }

    public OldPhone() {
    }

    public OldPhone(int id, String namePhone, double price, int time, String manufacturer, String batteryStatus, int description) {
        super(id, namePhone, price, time, manufacturer);
        this.batteryStatus = batteryStatus;
        this.description = description;
    }

    public String getBatteryStatus() {
        return batteryStatus;
    }

    public void setBatteryStatus(String batteryStatus) {
        this.batteryStatus = batteryStatus;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }
}
