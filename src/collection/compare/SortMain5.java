package collection.compare;

import java.util.TreeSet;

public class SortMain5 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);


        TreeSet<MyUser> myUsers1 = new TreeSet<>();
        myUsers1.add(myUser1);
        myUsers1.add(myUser2);
        myUsers1.add(myUser3);
        System.out.println("Comparable 기본 정렬");
        System.out.println(myUsers1);

        TreeSet<MyUser> myUsers2 = new TreeSet<>(new IdComparator());
        myUsers2.add(myUser1);
        myUsers2.add(myUser2);
        myUsers2.add(myUser3);
        System.out.println("IdComparator 정렬");
        System.out.println(myUsers2);


    }


}
