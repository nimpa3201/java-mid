package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
        //MyArrayList<Integer> list = new MyArrayList<>();  // 크기 50000 , 계산 시간: 3007ms
        MyLinkedList<Integer> list = new MyLinkedList<>();  // 크기 50000 , 계산 시간: 13ms

        BatchProcessor Processor = new BatchProcessor(list);
        Processor.logic(50000);

    }
}
