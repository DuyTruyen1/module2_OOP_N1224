package ss6_abstract_interface.phone_management;

import ss10_exception.validation.PhoneValidation;

import java.util.Scanner;

public abstract class Phone implements Comparable<Phone> {
    private String id;
    private String namePhone;
    private double price;
    private int time;
    private String manufacturer;

    @Override
    public int compareTo(Phone p) {
        return Double.compare(this.getPrice(), p.price);
    }
    public abstract double totalPrice();

    public void input() {
        this.namePhone = PhoneValidation.inputName("Name Phone");
        this.price = PhoneValidation.inputPrice("Price Phone");
        this.time = PhoneValidation.inputWarranty("Warranty Time");
        this.manufacturer = PhoneValidation.inputManufacturer("Manufacturer Name");
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
