package ss4_Inheritance.phone_management;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Phone> phoneList = new ArrayList<>();
        int choice;

        do {
            System.out.println("1. Add Old Phone");
            System.out.println("2. Add New Phone");
            System.out.println("3. Display all phones");
            System.out.println("4. Search phone by name");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    OldPhone oldPhone = new OldPhone();
                    oldPhone.input();
                    phoneList.add(oldPhone);
                    break;
                case 2:
                    NewPhone newPhone = new NewPhone();
                    newPhone.input();
                    phoneList.add(newPhone);
                    break;
                case 3:
                    for (Phone phone : phoneList) {
                        phone.output();
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.print("Enter phone name to search: ");
                    sc.nextLine();
                    String searchName = sc.nextLine();
                    for (Phone phone : phoneList) {
                        if (phone.getNamePhone().equalsIgnoreCase(searchName)) {
                            phone.output();
                            System.out.println();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);
    }
}
