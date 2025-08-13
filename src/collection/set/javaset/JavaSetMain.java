package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>(); //입력한 순서 보장 안함
        Set<String> linkedHashSet = new LinkedHashSet<>(); // 입력한 순서 보장함
        Set<String> treeSet = new TreeSet<>(); // 데이터 값을 기준으로 정렬한다

        run(hashSet);
        run(linkedHashSet);
        run(treeSet);

    }

    private static void run(Set<String> set) {
        System.out.println("set.getClass() = " + set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

    }

    /*
     * set.getClass() = class java.util.HashSet
     * A 1 B 2 C
     * set.getClass() = class java.util.LinkedHashSet
     * C B A 1 2
     * set.getClass() = class java.util.TreeSet
     * 1 2 A B C
     */


}
