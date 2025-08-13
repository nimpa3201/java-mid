package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));
        Set<Integer> ans1 = new HashSet<>(Set.copyOf(set2));
        Set<Integer> ans2 = new HashSet<>();
        Set<Integer> ans3 = new HashSet<>();

        for (Integer integer : set1) {
            ans1.add(integer);
            if (set2.contains(integer)) {
                ans2.add(integer);
            } else {
                ans3.add(integer);
            }
        }

        System.out.println("합집합: " + ans1);
        System.out.println("교집합: " + ans2);
        System.out.println("차집합: " + ans3);


        /*
         Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        // 합집합
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        // 교집합
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // 차집합 (A \ B)
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        // 보기 좋게 정렬해서 출력 (재현성 보장)
        System.out.println("합집합: " + new TreeSet<>(union));
        System.out.println("교집합: " + new TreeSet<>(intersection));
        System.out.println("차집합(A-B): " + new TreeSet<>(difference));
         */


    }
}