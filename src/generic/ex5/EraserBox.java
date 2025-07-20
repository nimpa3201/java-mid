package generic.ex5;

public class EraserBox <T> {


    /**
     * ⚠️ 컴파일 오류 발생
     * - Java의 제네릭은 타입 소거(Type Erasure)를 사용하기 때문에
     *   런타임에는 T의 구체적인 타입 정보를 알 수 없음
     * - 따라서 instanceof T는 컴파일 에러 발생
     *   → "Illegal generic type for instanceof"
     *
     * ✅ 대안
     * - 클래스 타입 정보를 함께 넘기는 방식 사용
     *   → 예: param instanceof Class<T>
     */
//    public Boolean instanceCheck(Object param){
//        return param instanceof T;
//    }

    /**
     * ⚠️ 컴파일 오류 발생
     * - new T()는 사용할 수 없음
     *   이유: 타입 T는 런타임에 지워지기 때문에
     *         new 연산자에 사용할 수 없음
     *
     * ✅ 대안
     * - 생성자 호출이 필요한 경우 Class<T>를 매개변수로 받아서 사용
     *   → 예: clazz.getDeclaredConstructor().newInstance()
     */

//    public T create(){
//        return new T();
//
//    }
}
