package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int i) {
        if (!cartMap.containsKey(product)) {
            cartMap.put(product, i);
        } else {
            cartMap.put(product, cartMap.get(product) + i);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Product product : cartMap.keySet()) {
            if (cartMap.get(product)<=0) {
                continue;
            }
            System.out.println("상품 :" + product + " 수량 : " + cartMap.get(product));
        }

    }

    public void minus(Product product, int i) {
        Integer integer = cartMap.get(product);
        cartMap.put(product, integer - i);
    }

}
