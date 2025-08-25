package collection.compare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        ArrayList<MyUser> myUsers = new ArrayList<>();
        myUsers.add(myUser1);
        myUsers.add(myUser2);
        myUsers.add(myUser3);
        System.out.println("기본 데이터");
        System.out.println("myUsers = " + myUsers);

        System.out.println("Comparator 기본 정렬");
        myUsers.sort(null);
        //Collections.sort(myUsers);
        System.out.println(myUsers);

        System.out.println("IdComparator 정렬");
        myUsers.sort(new IdComparator());
        //Collections.sort(myUsers,new IdComparator());
        System.out.println("myUsers = " + myUsers);

    }
}
