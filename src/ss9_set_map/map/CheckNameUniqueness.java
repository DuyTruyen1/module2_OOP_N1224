package ss9_set_map.map;

import java.util.*;

public class CheckNameUniqueness {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Truyền", "Hoàng", "Dũng", "Sơn", "Truyền");

        Map<String, Integer> nameCount = new HashMap<>();

        for (String name : names) {
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }

        for (String name : nameCount.keySet()) {
            if (nameCount.get(name) == 1) {
                System.out.println(name);
            }
        }
    }
}
