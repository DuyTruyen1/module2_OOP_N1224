package ss9_set_map.set;

import java.util.HashSet;

public class SumOfNonDuplicatedElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3, 1, 4, 5, 6, 6, 7, 4, 10};

        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
