package ss5_polymorphism.phone_management;

import java.util.Scanner;

public  class Phone {
    private String id;
    private String namePhone;
    private double price;
    private int time;
    private String manufacturer;


    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID: ");
        id = sc.nextLine();

        System.out.print("Enter Name: ");
        namePhone = sc.nextLine();

        System.out.print("Enter Price: ");
        price = Double.parseDouble(sc.nextLine());

        System.out.print("Enter Time: ");
        time = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Manufacturer: ");
        manufacturer = sc.nextLine();
    }

    public void output() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + namePhone);
        System.out.println("Price: " + price);
        System.out.println("Time: " + time);
        System.out.println("Manufacturer: " + manufacturer);
    }


    public Phone() {
    }

    public Phone(String id, String namePhone, double price, int time, String manufacturer) {
        this.id = id;
        this.namePhone = namePhone;
        this.price = price;
        this.time = time;
        this.manufacturer = manufacturer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
