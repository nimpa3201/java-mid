package generic.ex4;

import generic.animal.Animal;

public class AnimalMethod {

    public static <T extends Animal> void checkUp(T t) {
        System.out.println("동물의 이름 " + t.getName());
        System.out.println("동물의 크기 " + t.getSize());
        t.sound();

    }

    public static <T extends Animal> T bigger(T t1, T t2) {

        return  t1.getSize() > t2.getSize() ? t1 : t2; // 둘 중 큰 개를 반환
    }

}
