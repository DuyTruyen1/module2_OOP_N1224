package ss5_polymorphism.phone_management;

import java.util.Scanner;

public class NewPhone extends Phone {
    private int quantity;



    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();
    }

    @Override
    public void output(){
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
