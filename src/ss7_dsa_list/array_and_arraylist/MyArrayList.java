package ss7_dsa_list.array_and_arraylist;

public class MyArrayList {
    private int size;
    private int[] array;
    private int capacity;
    private int[] emptyArray = {};

    private int size() {
        return size;
    }

    public MyArrayList() {
        array = emptyArray;
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
    }

    public void add(int value) {
        if (array == emptyArray) {
            capacity = 10;
            array = new int[capacity];
        }
        if (size == capacity) {
            capacity *= 2;
            if (size == capacity) {
                capacity++;
            }
            //add new array size is capacity
            int[] arr = new int[capacity];

            for (int i = 0; i < size; i++) {
                arr[i] = array[i];
            }

            array = arr;
        }
        array[size] = value;
        size++;
    }

    //b.toString(): return in4 object
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size; i++) {
            str.append(array[i] + " ").append("\t");
        }
        return str.toString();
    }

    //c.add index
    public void add(int x, int k) {
        //check condition x or k null
        if (k < 0 || k > size) {
            return;
        }

        if (size == capacity) {
            capacity *= 2; // double capacity
            int[] newArray = new int[capacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        for (int i = size; i > k; i--) {
            array[i] = array[i - 1];
        }

        // add x
        array[k] = x;

        // increase size
        size++;
    }

    //d.set: replace index x

    public void set(int x, int k) {
        if (k < 0 || k > size) {
            return;
        }

        array[k] = x;
    }

    //e.get : return x
    public Integer get(int x) {
        if (x < 0 || x >= size) {
            System.out.println("X out of scope");
            return null;
        }
        return array[x];
    }

    //f. indexOf : get the first position found
    public int indexOf(int x) {
        for (int i = 0; i < size; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    //g.lastIndexOf: get the last position found
    public int lastIndexOf(int x) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    //h.remove

    public void remove(int x) {
        if (x < 0 || x >= size) {
            System.out.println("X out of scope");
            return;
        }
        //Shift x to the left to delete the element at x
        for (int i = x; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    //i.removeElement : remove all element
    public void removeAll(int x) {
        int newX = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] != x) {
                array[newX] = array[i];
                newX++;
            }
        }
//        update size
        size = newX;
    }
}
