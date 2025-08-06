package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
        initBuckets();
    }

    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value) {

        int index = hashIndex(value);
        LinkedList<Object> bucket = buckets[index];
        if (bucket.contains(value)) {
            return false;
        }
        bucket.add(value);
        size++;
        return true;

    }

    public boolean contains(Object searchValue){
        int index = hashIndex(searchValue);
        return buckets[index].contains(searchValue);
    }

    public boolean remove(Object value){
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
        return "MyHashSetV2{" +
            "buckets=" + Arrays.toString(buckets) +
            ", size=" + size +
            ", capacity=" + capacity +
            '}';
    }

    private int hashIndex(Object value) {
        int hashCode = value.hashCode();
        return Math.abs(hashCode %capacity);
    }


}
