package collection.set.test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        // 코드 작성
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(inputArr));

        for (Integer integer : hashSet) {
            System.out.println(integer);
        }


    }
}

//출력 예): 30, 20, 10 또는 10, 20, 30 또는 20, 10, 30등과 같이 출력 순서는 관계 없다.