package generic.ex5;

import generic.animal.Animal;

public class WildCardEx {

    static <T> void printGenericV1(Box<T> box){
        System.out.println(" T = " + box.get());
    }


    //Box<Dog>, Box<Cat>, Box<Object>
    static void printWildcardV1(Box<?> box){
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box< ? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends  Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static  Animal printAndReturnWildCard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }

    /**
     * 메서드의 타입들을 특정 시점에 변경하려면 제네릭 타입이나, 제네릭 메서드를 사용해야 한다.
     * 와일드카드는 이미 만들어진 제네릭 타입을 전달 받아서 활용할 때 사용한다. 따라서 메서드의 타입들을 타입 인자를 통
     * 해 변경할 수 없다. 쉽게 이야기해서 일반적인 메서드에 사용한다고 생각하면 된다.
     * 정리하면 제네릭 타입이나 제네릭 메서드가 꼭 필요한 상황이면 `<T>` 를 사용하고, 그렇지 않은 상황이면 와일드카드를
     * 사용하는 것을 권장한다.
     */
}
