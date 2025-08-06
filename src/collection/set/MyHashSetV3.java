package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<E>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
        initBuckets();
    }

    public MyHashSetV3(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }


    private void initBuckets() {
        buckets = new LinkedList[capacity]; // 제네릭 배열은 직접 생성 불가
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }


    public boolean add(E value) {

        int index = hashIndex(value);
        LinkedList<E> bucket = buckets[index];
        if (bucket.contains(value)) {
            return false;
        }
        bucket.add(value);
        size++;
        return true;

    }

    public boolean contains(E searchValue){
        int index = hashIndex(searchValue);
        return buckets[index].contains(searchValue);
    }

    public boolean remove(E value){
        int index = hashIndex(value);
        if (buckets[index].contains(value)){
            buckets[index].remove(value);
            size--;
            return true;
        }
        return false;
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
            "buckets=" + Arrays.toString(buckets) +
            ", size=" + size +
            ", capacity=" + capacity +
            '}';
    }

    private int hashIndex(E value) {
        int hashCode = value.hashCode();
        return Math.abs(hashCode %capacity);
    }


}
