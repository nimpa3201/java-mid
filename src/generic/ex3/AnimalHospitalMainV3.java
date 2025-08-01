package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
       // 타입매개변수 제한으로 인해 컴파일오류 발생
       // AnimalHospitalV3<Integer> integer = new AnimalHospitalV3<>();


        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        // 문제 1 : 개 병원에 고양이 전달
        //dogHospital.set(cat); // 다른 타입 입력 : 컴파일 오류


        dogHospital.set(dog);
        Dog biggerDog =  dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("bigger = " + biggerDog);

    }
}

