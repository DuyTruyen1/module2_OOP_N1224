package ss9_set_map.set;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3, 1, 4, 5, 6, 6, 7, 4, 10};
        int[] uniqueArr = removeDuplicates(arr);

        System.out.println("List index only");
        for (int num : uniqueArr) {
            System.out.println(num);
        }

    }

    static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int[] unique = new int[set.size()];
        int index = 0;
        for (int num : set) {
            unique[index] = num;
            index++;
        }
        return unique;
    }
}
