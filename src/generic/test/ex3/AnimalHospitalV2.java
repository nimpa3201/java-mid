 package generic.test.ex3;


 import generic.animal.Animal;

 public class AnimalHospitalV2 <T> {

    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public void checkUp() {
        animal.toString();
        animal.equals(null);

        // T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 가능
//        System.out.println("동물의 이름 " + animal.getName());
//        System.out.println("동물의 크기 " + animal.getSize());
//        animal.sound();
    }

    public T bigger(T target) {
        // 컴파일 오류
        //tSize() > target.getSize() ? animal : target; // 둘 중 큰 개를 반환
        return  null;
    }


}
