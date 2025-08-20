package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        HashMap<String, Integer> commonMap = new HashMap<>();
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                Integer integer1 = map1.get(key);
                Integer integer2 = map2.get(key);
                commonMap.put(key, integer1 + integer2);
            }

        }

        System.out.println(commonMap);

    }

}


//{B=6, C=8}