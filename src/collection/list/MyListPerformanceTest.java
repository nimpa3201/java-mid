package collection.list;

public class MyListPerformanceTest {
    public static void main(String[] args) {
        int size = 50000;
        System.out.println("===== MyArrayList 추가 =====");
        addFirst(new MyArrayList<>(), size);
        addMid(new MyArrayList<>(), size);
        MyArrayList<Integer> arrayList = new MyArrayList<>(); // 조회용 데이터로 사용
        addLast(arrayList, size);

        int loop = 10000;
        System.out.println("===== MyArrayList 조회 =====");
        getIndex(arrayList,loop,0);
        getIndex(arrayList,loop,size/2);
        getIndex(arrayList,loop,size-1);


        System.out.println("===== MyArrayList 검색 =====");
        search(arrayList,loop,0);
        search(arrayList,loop,size/2);
        search(arrayList,loop,size-1);



        System.out.println("===== MyLinkedList 추가 =====");
        addFirst(new MyLinkedList<>(), size);
        addMid(new MyLinkedList<>(), size);
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        addLast(linkedList, size);

        System.out.println("===== MyLinkedList 조회 =====");
        getIndex(linkedList,loop,0);
        getIndex(linkedList,loop,size/2);
        getIndex(linkedList,loop,size-1);


        System.out.println("===== MyLinkedList 검색 =====");
        search(linkedList,loop,0);
        search(linkedList,loop,size/2);
        search(linkedList,loop,size-1);
    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간" + (endTime - startTime) + "ms");

    }

    private static void addMid(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간" + (endTime - startTime) + "ms");

    }

    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간" + (endTime - startTime) + "ms");

    }

    private static void getIndex(MyList<Integer> list, int loop,int index){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: "+ (endTime - startTime) + "ms");
    }

    private static void search(MyList<Integer> list, int loop,int findValue){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간: "+ (endTime - startTime) + "ms");
    }

}

/**
 *
 * ===== MyArrayList 추가 =====
 * 앞에 추가 - 크기: 50000, 계산 시간2707ms
 * 평균 추가 - 크기: 50000, 계산 시간1161ms
 * 뒤에 추가 - 크기: 50000, 계산 시간3ms
 * ===== MyArrayList 조회 =====
 * index: 0, 반복: 10000, 계산 시간: 0ms
 * index: 25000, 반복: 10000, 계산 시간: 1ms
 * index: 49999, 반복: 10000, 계산 시간: 0ms
 * ===== MyArrayList 검색 =====
 * findValue: 0, 반복: 10000, 계산 시간: 1ms
 * findValue: 25000, 반복: 10000, 계산 시간: 183ms
 * findValue: 49999, 반복: 10000, 계산 시간: 363ms
 * ===== MyLinkedList 추가 =====
 * 앞에 추가 - 크기: 50000, 계산 시간5ms
 * 평균 추가 - 크기: 50000, 계산 시간1094ms
 * 뒤에 추가 - 크기: 50000, 계산 시간2657ms
 * ===== MyLinkedList 조회 =====
 * index: 0, 반복: 10000, 계산 시간: 0ms
 * index: 25000, 반복: 10000, 계산 시간: 446ms
 * index: 49999, 반복: 10000, 계산 시간: 872ms
 * ===== MyLinkedList 검색 =====
 * findValue: 0, 반복: 10000, 계산 시간: 0ms
 * findValue: 25000, 반복: 10000, 계산 시간: 594ms
 * findValue: 49999, 반복: 10000, 계산 시간: 1218ms
 */
