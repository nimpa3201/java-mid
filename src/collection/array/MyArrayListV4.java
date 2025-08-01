package collection.array;

import java.util.Arrays;

public class MyArrayListV4 <E> {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV4() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(E e) {
        // 코드 추가
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    //코드 추가

    public void add(int index, E e) {
        if (size == elementData.length) {
            grow();
        }
        shiftRightFrom(index);
        elementData[index] = e;
        size++;

    }

    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }


    // 코드 추가
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = 2 * oldCapacity;
        // 배열을 새로 만들고 기존 배열을 새로운 배열에 복사
       /*
       Object[] newArr = new Object[newCapacity];

        for (int i = 0; i < elementData.length; i++) {
            newArr[i] = elementData[i];
        }
        */
        elementData = Arrays.copyOf(elementData, newCapacity);
    }


    @SuppressWarnings("unchecked") // 경고 무시
    public E get(int index) {
        return (E) elementData[index];
    }

    public E set(int index, Object element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    // 코드 추가
    public E remove(int index){
        E oldValue = get(index);
        // 데이터 이동
        shiftLeftFrom(index);

        size--;
        elementData[size] = null;
        return oldValue;
    }

    // 코드 추가 요소의 index부터 마지막까지 왼쪽으로 밀기
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size-1; i++) {
            elementData[i] = elementData[i+1];
        }
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(o)) {
                return i;
            }
            ;
        }
        return -1;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
            " size= " + size + " , capacity= " + elementData.length;
    }
}
