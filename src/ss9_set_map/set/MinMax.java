package ss9_set_map.set;

import java.util.TreeSet;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {5, 3, 5, 2, 6, 7, 1, 9, 12};
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int min = set.first();
        int max = set.last();

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
