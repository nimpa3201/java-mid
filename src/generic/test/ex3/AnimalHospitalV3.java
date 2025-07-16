 package generic.test.ex3;


 import generic.animal.Animal;

 public class AnimalHospitalV3<T extends Animal> { // T 제한

    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public void checkUp() {
        System.out.println("동물의 이름 " + animal.getName());
        System.out.println("동물의 크기 " + animal.getSize());
        animal.sound();

    }

    public T bigger(T target) {

       return  animal.getSize() > target.getSize() ? animal : target; // 둘 중 큰 개를 반환
    }


}
