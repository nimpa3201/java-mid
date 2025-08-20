package collection.map.test;

import java.util.*;

public class ItemPriceTest {
    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        for (String string : map.keySet()) {
            if(map.get(string) == 1000){
                result.add(string);

            }
        }

        System.out.println(result);

    }
}
//[망고, 딸기]