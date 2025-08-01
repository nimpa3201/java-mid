package collection.array;

public class MyArrayListV2Main {
    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2();
        System.out.println("=== 데이터 추가 ===");
        System.out.println("list = " + list);
        list.add("a");
        System.out.println("list = " + list);
        list.add("b");
        System.out.println("list = " + list);
        list.add("c");
        System.out.println("list = " + list);


        System.out.println("=== 기능 사용 ===");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf(\"c\") = " + list.indexOf("c"));
        System.out.println("list.set(2,\"z\") = " + list.set(2, "z"));
        System.out.println("list = " + list); // list = [a, b, z] size= 3 , capacity= 5


        System.out.println("=== 범위 초과 ===");
        list.add("d");
        System.out.println("list = " + list);
        list.add("e");
        System.out.println("list = " + list);


        list.add("f");
        System.out.println("list = " + list); //list = [a, b, z, d, e, f] size= 6 , capacity= 10


    }
}
