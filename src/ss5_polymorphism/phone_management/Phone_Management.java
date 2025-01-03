package ss5_polymorphism.phone_management;

public class Phone_Management {
    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone();
        OldPhone oldPhone = new OldPhone();

        newPhone.input();
        newPhone.output();

        oldPhone.input();
        oldPhone.output();
    }
}
