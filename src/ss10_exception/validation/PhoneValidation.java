package ss10_exception.validation;

import java.util.Scanner;

public class PhoneValidation {
    private static final Scanner scanner = new Scanner(System.in);

    public static String inputName(String fieldName) {
        while (true) {
            try {
                System.out.printf("Enter $s: ", fieldName);
                String name = scanner.nextLine();

                CommonValidation.validateIsEmpty(name, fieldName);
                return name;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Enter valid phone number");
            }
        }
    }

    public static double inputPrice(String fieldName) {
        while (true) {
            try {
                System.out.printf("Enter $s: ", fieldName);
                String price = scanner.nextLine();

                CommonValidation.validateIsEmpty(price, fieldName);
                double priceDouble = CommonValidation.parseDouble(price, fieldName);
                CommonValidation.validateIsNegative(priceDouble, fieldName);
                return priceDouble;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Enter valid phone number");
            }
        }
    }

    public static int inputWarranty(String fieldName) {
        while (true) {
            try {
                System.out.printf("Enter $s: ", fieldName);
                String warranty = scanner.nextLine();

                CommonValidation.validateIsEmpty(warranty, fieldName);
                int warrantyInt = CommonValidation.parseInt(warranty, fieldName);
                CommonValidation.validateIsNegative(warrantyInt, fieldName);
                return warrantyInt;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Enter valid phone number");
            }
        }
    }

    public static String inputManufacturer(String fieldName) {
        while (true) {
            try {
                System.out.printf("Enter $s: ", fieldName);
                String manufacturer = scanner.nextLine();

                CommonValidation.validateIsEmpty(manufacturer, fieldName);
                return manufacturer;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Enter valid phone number");
            }
        }
    }

    public static Integer inputBatteryPercentage(String fieldName) {
        while (true) {
            try {
                System.out.printf("Enter $s: ", fieldName);
                String batteryPercentage = scanner.nextLine();

                CommonValidation.validateIsEmpty(batteryPercentage, fieldName);
                int battery = CommonValidation.parseInt(batteryPercentage, fieldName);
                CommonValidation.validateNumberOutOfRange(battery, fieldName, 0, 100);
                return battery;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Enter valid phone number");
            }
        }
    }


    public static String inputDescription(String fieldName) {
        while (true) {
            try {
                System.out.printf("Enter $s: ", fieldName);
                String desc = scanner.nextLine();

                CommonValidation.validateIsEmpty(desc, fieldName);
                CommonValidation.validateMinLength(desc, fieldName, 10);

                return desc;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Enter valid phone number");
            }
        }
    }

    public static Integer inputQuantity(String fieldName) {
        while (true) {
            try {
                System.out.printf("Enter $s: ", fieldName);
                String qtySt = scanner.nextLine();

                CommonValidation.validateIsEmpty(qtySt, fieldName);
                int qty = CommonValidation.parseInt(qtySt, fieldName);
                CommonValidation.validateIsNegative(qty, fieldName);

                return qty;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Enter valid phone number");
            }
        }
    }
}
