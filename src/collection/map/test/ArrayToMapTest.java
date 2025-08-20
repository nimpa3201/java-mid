package collection.map.test;

import java.util.HashMap;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};
        HashMap<String, Integer> product = new HashMap<>();
        for (String[] strings : productArr) {
            product.put(strings[0], Integer.valueOf(strings[1]));

        }
        for (String key: product.keySet()) {
            System.out.println("제품: " + key + " 가격: "+ product.get(key));
        }

    }
}

/*
제품: Java, 가격: 10000
제품: JPA, 가격: 30000
제품: Spring, 가격: 20000
 */