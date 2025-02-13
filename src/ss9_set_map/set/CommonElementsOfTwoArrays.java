package ss9_set_map.set;

import java.util.HashSet;

public class CommonElementsOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            set2.add(num);
        }

        HashSet<Integer> commonSet = new HashSet<>(set1);

        commonSet.retainAll(set2);
        for (int num : commonSet) {
            System.out.println(num);
        }
    }
}
