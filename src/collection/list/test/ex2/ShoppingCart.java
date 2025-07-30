package collection.list.test.ex2;

import java.util.ArrayList;

public class ShoppingCart {
    private final ArrayList<Item> cart = new ArrayList<>();

    public void addItem(Item item) {
        cart.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int sumValue = 0;
        for (Item item : cart) {
            System.out.println("상품명:" + item.getName() + ", " + "합계:" + item.getTotalPrice());
            sumValue += item.getTotalPrice();
        }
        System.out.println("전체 가격 합:" + sumValue);
    }

}



