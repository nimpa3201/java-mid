package generic.test.ex3.unit;

import generic.test.ex3.Shuttle;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T > shuttle){
        T out = shuttle.out();
        System.out.println("이름: " + out.getName() + ", HP: " + out.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> shuttle){
        BioUnit out = shuttle.out();
        System.out.println("이름: " + out.getName() + ", HP: " + out.getHp());
    }
}
