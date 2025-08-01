package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //{1,2,5,8,14,99,9}
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        System.out.println("buckets = " + Arrays.toString(buckets));

        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();


        }

        System.out.println("buckets = " + Arrays.toString(buckets));

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9);
        add(buckets, 9); // 중복 방지 확인용

        System.out.println("buckets = " + Arrays.toString(buckets));

        //검색
        int searchValue = 9;
        System.out.println(contains(searchValue, buckets));


    }

    private static boolean contains(int searchValue, LinkedList<Integer>[] buckets) {
        int hashIndex = getHashIndex(searchValue); // O(1)
        return buckets[hashIndex].contains(searchValue); // O(N)
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = getHashIndex(value);
        if (!buckets[hashIndex].contains(value)) { // 중복 방지
            buckets[hashIndex].add(value);
        }

    }

    private static int getHashIndex(int value) {
        return value % CAPACITY;

    }


}
