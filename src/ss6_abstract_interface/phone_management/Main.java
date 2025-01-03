package ss6_abstract_interface.phone_management;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    static ArrayList<Phone> phones = new ArrayList<>();

    static {
        phones.add(new OldPhone("OP001", "Iphone 14", 250000, 6, "Apple", "99", "Used"));
        phones.add(new OldPhone("OP002", "Iphone 15", 290000, 6, "Apple", "95", "Used"));
        phones.add(new NewPhone("NP001", "Ultra", 34000, 8, "Samsung", 9));
        phones.add(new NewPhone("NP002", "Ultra X", 34000, 19, "Samsung", 9));
    }

    public static void main(String[] args) {
        ArrayList<Phone> phoneList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choose;
        while (true) {
            do {
                System.out.println("PHONE MANAGEMENT");
                System.out.println("1. View phone list");
                System.out.println("2. Add new phone");
                System.out.println("3. Update phone");
                System.out.println("4. Delete phone");
                System.out.println("5. Sort by price");
                System.out.println("6. Search phone");
                System.out.println("7. Total price");
                System.out.println("8. Old phone discount ");
                System.out.println("9. Exit");
                System.out.print("Please make your choice: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        showList();
                        break;
                    case 2:
                        addNew();
                        break;
                    case 3:
                        update();
                        break;
                    case 4:
                        delete();
                        break;
                    case 5:
                        sort();
                        break;
                    case 6:
                        search();
                        break;
                    case 7:
                        System.out.println("Total price all phone : " + calculateTotalPrice());
                        break;
                    case 8:
                        System.out.println("Enter into discount percentage");
                        double percentage = Double.parseDouble(sc.nextLine());
                        discountOldPhones(percentage);
                        System.out.println("Discounted successfully");
                        break;
                    case 9:
                        return;
                    default:
                        System.out.println("Your choice is invalid!");
                }
            } while (choose < 1 || choose > 5);
        }

    }

    private static void showList() {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            do {
                System.out.println("PHONE LIST MENU:");
                System.out.println("1. View all phones");
                System.out.println("2. View old phones");
                System.out.println("3. View new phones");
                System.out.println("4. Return to main menu");

                System.out.print("Please make a choice: ");
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        System.out.println("==== List of All Phones ====");
                        for (int i = 0; i < phones.size(); i++) {
                            System.out.println("Phone details #" + (i + 1));
                            phones.get(i).output();
                        }
                        for (int i = 0; i < phones.size(); i++) {
                            System.out.println("Phone details #" + (i + 1 + phones.size()));
                            phones.get(i).output();
                        }
                        break;
                    case 2:
                        System.out.println("==== List of Old Phones ====");
                        for (int i = 0; i < phones.size(); i++) {
                            System.out.println("Phone details #" + (i + 1));
                            phones.get(i).output();
                        }
                        break;
                    case 3:
                        System.out.println("==== List of New Phones ====");
                        for (int i = 0; i < phones.size(); i++) {
                            System.out.println("Phone details #" + (i + 1));
                            phones.get(i).output();
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid choice, please try again!");
                }
            } while (choice < 1 || choice > 4);
        }
    }

    private static void addNew() {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println(" ADD NEW PHONE");
            System.out.println("1. Add Old Phone");
            System.out.println("2. Add New Phone");
            System.out.println("3. Return to main menu");

            System.out.print("Please make a choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    OldPhone oldPhone = new OldPhone();
                    oldPhone.input();
                    oldPhone.setId(oldPhone.getId());
                    phones.add(oldPhone);
                    System.out.println("Add new phone successfully");
                    break;
                case 2:
                    NewPhone newPhone = new NewPhone();
                    newPhone.input();
                    newPhone.setId(newPhone.getId());
                    phones.add(newPhone);
                    System.out.println("Add new phone successfully");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice, please try again!");
            }
        }
    }

    private static String getIdOldPhone() {
        if (phones.isEmpty()) {
            return "IP001";
        }

        int max = Integer.parseInt(phones.get(0).getId().substring(3));

        for (int i = 1; i < phones.size(); i++) {
            int id = Integer.parseInt(phones.get(i).getId().substring(3));
            if (max < id) {
                max = id;
            }
        }
        return String.format("OP%3d", max + 1).replace(" ", "0");
    }

    private static String getIdNewPhone() {
        if (phones.isEmpty()) {
            return "SS001";
        }

        int max = Integer.parseInt(phones.get(0).getId().substring(3));

        for (int i = 1; i < phones.size(); i++) {
            int id = Integer.parseInt(phones.get(i).getId().substring(3));
            if (max < id) {
                max = id;
            }
        }
        return String.format("NP%3d", max + 1).replace(" ", "0");
    }

    private static void update() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ID to update: ");
        String id = sc.nextLine();

        if (id.startsWith("NP") || id.startsWith("OP")) {
            boolean isExistPhone = false;
            for (Phone phone : phones) {
                if (phone.getId().equals(id)) {
                    isExistPhone = true;
                    phone.input();
                    System.out.println("Update successful!");
                    break;
                }
            }

            if (!isExistPhone) {
                System.out.println("ID not found!");
            }
        } else {
            System.out.println("Invalid ID!");
        }
    }

    private static void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ID to delete: ");
        String id = sc.nextLine().trim();

        // In toàn bộ danh sách để kiểm tra trước khi thực hiện
        System.out.println("Current list of phones:");
        for (Phone phone : phones) {
            System.out.println(phone.getId());
        }

        if (id.startsWith("OP") || id.startsWith("NP")) { // Kiểm tra ID hợp lệ
            boolean isExistPhone = false;
            for (Phone phone : phones) {
                if (phone.getId().equalsIgnoreCase(id)) {
                    isExistPhone = true;
                    System.out.printf("Do you want to delete the phone with ID %s? (Yes/No)\n", id);
                    String confirm = sc.nextLine().trim();
                    if ("yes".equalsIgnoreCase(confirm)) {
                        phones.remove(phone);
                        System.out.println("Deleted successfully!");
                    } else {
                        System.out.println("Deletion canceled!");
                    }
                    break;
                }
            }

            if (!isExistPhone) {
                System.out.println("ID not found!");
            }
        } else {
            System.out.println("Invalid ID!");
        }
    }

    private static void sort() {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("====== Sort ======");
            System.out.println("1. Increase");
            System.out.println("2. Decrease");
            System.out.println("3. Return to main menu");

            System.out.print("Please make a choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    for (int i = 0; i < phones.size() - 1; i++) {
                        for (int j = i + 1; j < phones.size(); j++) {
                            if (phones.get(i).getPrice() > phones.get(j).getPrice()) {
                                Phone temp = phones.get(i);
                                phones.set(i, phones.get(j));
                                phones.set(j, temp);
                            }
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < phones.size() - 1; i++) {
                        for (int j = i + 1; j < phones.size(); j++) {
                            if (phones.get(i).getPrice() < phones.get(j).getPrice()) {
                                Phone temp = phones.get(i);
                                phones.set(i, phones.get(j));
                                phones.set(j, temp);
                            }
                        }
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice, please try again!");
            }
        }
    }

    private static void search() {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("====== Search ======");
            System.out.println("1. Search All Phones");
            System.out.println("2. Search Old Phones");
            System.out.println("3. Search New Phones");
            System.out.println("4. Return to main menu");

            System.out.print("Please make a choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    searchAllPhones();
                    break;
                case 2:
                    searchOldPhones();
                    break;
                case 3:
                    searchNewPhones();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice, please try again!");
            }
        }
    }

    private static void searchAllPhones() {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("====== Search All Phones");
            System.out.println("1. Search Price");
            System.out.println("2. Search Name");
            System.out.println("3. Search Brand");
            System.out.println("4. Return to main menu");

            System.out.print("Please make a choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter price range: ");
                    System.out.println("Enter price : ");
                    int priceRange = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter price to ... ");
                    int priceTo = Integer.parseInt(sc.nextLine());

                    int count = 1;
                    for (Phone phone : phones) {
                        if (phone.getPrice() >= priceRange && phone.getPrice() <= priceTo) {
                            System.out.println("Information phone : " + count++);
                            phone.output();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter name : ");
                    String name = sc.nextLine();
                    count = 1;
                    for (Phone phone : phones) {
                        if (phone.getNamePhone().contains(name)) {
                            System.out.println("Information phone : " + count++);
                            phone.output();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter brand : ");
                    String brand = sc.nextLine();
                    count = 1;
                    for (Phone phone : phones) {
                        if (phone.getManufacturer().contains(brand)) {
                            System.out.println("Information phone : " + count++);
                            phone.output();
                        }
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice, please try again!");
            }
        }
    }

    private static void searchOldPhones() {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            ArrayList<OldPhone> oldPhones = new ArrayList<>();
            System.out.println("====== Search Old Phones");
            System.out.println("1. Search price old phone");
            System.out.println("2. Search name old phone");
            System.out.println("3. Search brand old phone");
            System.out.println("4. Return to main menu");

            System.out.println("Please make a choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter price range: ");
                    System.out.println("Enter price : ");
                    int priceRange = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter price to ... ");
                    int priceTo = Integer.parseInt(sc.nextLine());

                    int count = 1;
                    for (Phone phone : oldPhones) {
                        if (phone.getPrice() >= priceRange && phone.getPrice() <= priceTo) {
                            System.out.println("Information phone : " + count++);
                            phone.output();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter name : ");
                    String name = sc.nextLine();
                    count = 1;
                    for (Phone phone : oldPhones) {
                        if (phone.getNamePhone().contains(name)) {
                            System.out.println("Information phone : " + count++);
                            phone.output();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter brand : ");
                    String brand = sc.nextLine();
                    count = 1;
                    for (Phone phone : oldPhones) {
                        if (phone.getManufacturer().contains(brand)) {
                            System.out.println("Information phone : " + count++);
                            phone.output();
                        }
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice, please try again!");
            }
        }
    }

    private static void searchNewPhones() {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            ArrayList<NewPhone> newPhones = new ArrayList<>();
            System.out.println("====== Search New Phones");
            System.out.println("1. Search price new phone");
            System.out.println("2. Search name new phone");
            System.out.println("3. Search brand new phone");
            System.out.println("4. Return to main menu");

            System.out.println("Please make a choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter price range: ");
                    System.out.println("Enter price : ");
                    int priceRange = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter price to ... ");
                    int priceTo = Integer.parseInt(sc.nextLine());

                    int count = 1;
                    for (Phone phone : newPhones) {
                        if (phone.getPrice() >= priceRange && phone.getPrice() <= priceTo) {
                            System.out.println("Information phone : " + count++);
                            phone.output();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter name : ");
                    String name = sc.nextLine();
                    count = 1;
                    for (Phone phone : newPhones) {
                        if (phone.getNamePhone().contains(name)) {
                            System.out.println("Information phone : " + count++);
                            phone.output();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter brand : ");
                    String brand = sc.nextLine();
                    count = 1;
                    for (Phone phone : newPhones) {
                        if (phone.getManufacturer().contains(brand)) {
                            System.out.println("Information phone : " + count++);
                            phone.output();
                        }
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice, please try again!");
            }
        }
    }

    // loc dth cu
    private static ArrayList<OldPhone> getOldPhoneList() {
        ArrayList<OldPhone> oldPhoneList = new ArrayList<>();
        for (Phone phone : oldPhoneList) {
            if (phone instanceof OldPhone) {
                oldPhoneList.add((OldPhone) phone);
            }
        }
        return oldPhoneList;
    }

    // loc dth moi
    private static ArrayList<NewPhone> getNewPhoneList() {
        ArrayList<NewPhone> newPhoneList = new ArrayList<>();
        for (Phone phone : newPhoneList) {
            if (phone instanceof OldPhone) {
                newPhoneList.add((NewPhone) phone);
            }
        }
        return newPhoneList;
    }

    private static double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Phone phone : phones) {
            totalPrice += phone.totalPrice();
        }
        return totalPrice;
    }

    private static void discountOldPhones(double percentage) {
        for (Phone phone : phones) {
            if (phone instanceof OldPhone) {
                ((OldPhone) phone).discount(percentage);
            }
        }
    }

}

