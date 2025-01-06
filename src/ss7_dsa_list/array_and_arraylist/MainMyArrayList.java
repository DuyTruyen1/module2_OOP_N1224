package ss7_dsa_list.array_and_arraylist;

public class MainMyArrayList {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        // Test add(value)
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        System.out.println("After adding elements: " + list);

        list.add(100, 2); // Add 100 at index 2
        System.out.println("After adding 100 at index 2: " + list);

        list.set(50, 3); // Replace value at index 3 with 50
        System.out.println("After setting 50 at index 3: " + list);

        System.out.println("Value at index 2: " + list.get(2));

        System.out.println("First occurrence of 15: " + list.indexOf(15));

        list.add(15); // Add duplicate 15 to test lastIndexOf
        System.out.println("Last occurrence of 15: " + list.lastIndexOf(15));

        list.remove(2); // Remove element at index 2
        System.out.println("After removing element at index 2: " + list);

        list.removeAll(15); // Remove all occurrences of 15
        System.out.println("After removing all occurrences of 15: " + list);
    }
}
