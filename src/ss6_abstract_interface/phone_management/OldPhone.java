package ss6_abstract_interface.phone_management;

import java.util.Scanner;

public class OldPhone extends Phone implements Discount {
    private String batteryStatus;
    private String description;

    @Override
    public double totalPrice() {
        return getPrice();
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Battery Status: ");
        batteryStatus = sc.nextLine();
        System.out.print("Enter Dsc.nextLiscription: ");
        description = sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Battery Status: " + batteryStatus);
    }

    public OldPhone() {
    }

    public OldPhone(String id, String namePhone, double price, int time, String manufacturer, String batteryStatus, String description) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void discount(double percentage) {
        double discountPrice = getPrice() * (1 - percentage / 100.0);//chuyển gtri sang dạng thaap phan . 20% => 0.2%
        setPrice(discountPrice);//update pr
    }
}