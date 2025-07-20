package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class Shuttle <T extends BioUnit>{

    private T value;

    public void in(T value){
        this.value = value;
    }


    public void showInfo(){
        System.out.println("이름= " + value.getName()+ ", HP= " + value.getHp());

    }
}
