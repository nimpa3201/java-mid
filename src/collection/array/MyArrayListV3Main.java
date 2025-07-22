package collection.array;

public class MyArrayListV3Main {

    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        // 마지막에 추가
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("list = " + list);

        //원하는 위치에 추가
        System.out.println("addLast");
        list.add(3,"addList");
        System.out.println("list = " + list);

        System.out.println("addFirst");
        list.add(0,"addFirst");
        System.out.println("list = " + list);


        // 삭제
        Object remove4 = list.remove(4);//remove addLast
        System.out.println("remove4 = " + remove4);
        System.out.println("list = " + list);

        Object remove0 = list.remove(0);
        System.out.println("remove0 = " + remove0);
        System.out.println("list = " + list);

    }
}
