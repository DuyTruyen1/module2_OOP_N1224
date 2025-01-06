package ss9_set_map.map;

import java.util.HashMap;
import java.util.Map;

public class CountWordsAppear {
    public static void main(String[] args) {
        String text = "Phạm Duy Truyền siêu cấp vip pro số 1 Đông Nam Á ";
        Map<String, Integer> wordCount = new HashMap<String, Integer>();

        String[] words = text.split(" ");//tach chuoi

        for (String word : words) {
            word = word.toLowerCase();

            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            System.out.println(word + " : " + count);
        }
    }
}
