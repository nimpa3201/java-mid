package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        // 가정 : 숫자만 입력하기를 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자3"); // 문자를 입력
        System.out.println("numberList = " + numberList);

        // 오브젝트 반환하므로 다운 캐스팅 필요
        Integer num1 = (Integer)numberList.get(1);
        Integer num2 = (Integer)numberList.get(2);

       // Integer num3 = (Integer)numberList.get(3); Exception in thread "main" java.lang.ClassCastException

    }
}
