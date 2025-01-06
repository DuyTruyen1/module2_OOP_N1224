package ss7_dsa_list.array_and_arraylist;

public class MainMyLinkedList {

    public class Main {
        public static void main(String[] args) {
            MyLinkedList linkedList = new MyLinkedList();

            linkedList.addFirst(10);
            linkedList.addFirst(20);
            linkedList.addFirst(30);
            System.out.println("After adding elements at the beginning: " + linkedList);

            // b. Add elements to the end of the list
            linkedList.addLast(40);
            linkedList.addLast(50);
            System.out.println("After adding elements at the end: " + linkedList);

            // c. Add elements at specific positions
            linkedList.add(2, 25);
            System.out.println("After adding 25 at index 2: " + linkedList);

            // d. Get the first element
            System.out.println("First element: " + linkedList.getFirst());

            // e. Get the last element
            System.out.println("Last element: " + linkedList.getLast());

            // f. Get an element by index
            System.out.println("Element at index 3: " + linkedList.get(3));

            // g. Update an element at a specific index
            linkedList.set(3, 35);
            System.out.println("After updating index 3 to 35: " + linkedList);

            // h. Find the index of a specific value
            System.out.println("Index of 25: " + linkedList.indexOf(25));

            // i. Find the last index of a specific value
            linkedList.addLast(35);
            System.out.println("Last index of 35: " + linkedList.lastIndexOf(35));

            // j. Remove the first element
            linkedList.removeFirst();
            System.out.println("After removing the first element: " + linkedList);

            // k. Remove the last element
            linkedList.removeLast();
            System.out.println("After removing the last element: " + linkedList);

            // l. Remove an element by index
            linkedList.remove(2); // Remove element at index 2
            System.out.println("After removing element at index 2: " + linkedList);
        }
    }

}
