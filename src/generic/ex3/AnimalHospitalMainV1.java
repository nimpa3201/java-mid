package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        // 문제 1 : 개 병원에 고양이 전달
         dogHospital.set(cat); // 매개변수 체크 실패 : 컴파일 오류 발생하지 않음 타입 안정성 낮음

        // 개 타입 반환 , 캐스팅 필요
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("bigger = " + biggerDog);

    }
}

// 코드 재사용성은 높지만 타입 안전성은 낮음