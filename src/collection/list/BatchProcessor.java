package collection.list;

public class BatchProcessor {

    private final MyList<Integer> list;

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {

        Long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("크기 " + size + " , 계산 시간: " + (endTime - startTime) + "ms");
    }

}
