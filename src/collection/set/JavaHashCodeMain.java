package collection.set;
import collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        // Object의 기본  hashCode는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1 = " + obj1.hashCode());
        System.out.println("obj2 = " + obj2.hashCode());

        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("i.hashCode() = " + i.hashCode());
        System.out.println("A.hashCode() = " + strA.hashCode());
        System.out.println("AB.hashCode() = " + strAB.hashCode());

        //hashCode는 마이너스 값이 들어올 수 있음
        System.out.println("(-1).hashCode() = " + Integer.valueOf(-1).hashCode());

        // 둘은 같을까 다를까 ?, 인스턴스는 다르지만 , equals는 같다.
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");


         //equals, hashCode를 오버라이딩 하지 않은 경우와, 한 경우를 비교

        System.out.println("(member1 == member2) = " + (member1==member2));
        System.out.println("(member1 equals member2) = " + (member1.equals(member2)));

        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());

        /*
        동일성과 동등성에서 학습한 내용을 복습해보자.
        `Object` 는 동등성 비교를 위한 `equals()` 메서드를 제공한다.
        자바는 두 객체가 같다는 표현을 2가지로 분리해서 사용한다.
        동일성(Identity): `==` 연산자를 사용해서 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
        동등성(Equality): `equals()` 메서드를 사용하여 두 객체가 논리적으로 동등한지 확인

         */
    }
}
