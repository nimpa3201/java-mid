package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        HashMap<String, Integer> result = new HashMap<>();
        String text = "orange banana apple apple banana apple";
        for (String string : text.split(" ")) {
            if (!result.containsKey(string)) {

                result.put(string, 1);

            } else {
                result.put(string, result.get(string) + 1);
            }

        }
        System.out.println(result);
    }
}


//{orange=1, banana=2, apple=3}
