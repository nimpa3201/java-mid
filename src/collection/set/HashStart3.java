package collection.set;

import java.util.Arrays;

public class HashStart3 {

    public static void main(String[] args) {
        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 99;
        Integer result = inputArray[searchValue]; //O(1)
        System.out.println("result = " + result);

    }

    //한계 : 검색 속도는 O(1)이지만 메모리 낭비 심각

}
