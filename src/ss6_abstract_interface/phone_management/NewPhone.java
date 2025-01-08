package ss6_abstract_interface.phone_management;

import ss10_exception.validation.PhoneValidation;

import java.util.Scanner;

public class NewPhone extends Phone {
    private int quantity;

    @Override
    public double totalPrice() {
        return getPrice() * quantity;
    }

    @Override
    public void input() {
        super.input();
        this.quantity = PhoneValidation.inputQuantity("Quantity");
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Quantity: " + quantity);
    }


    public NewPhone() {
    }

    public NewPhone(String id, String namePhone, double price, int time, String manufacturer, int quantity) {
        super(id, namePhone, price, time, manufacturer);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
