package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {
        Map<String,Integer> studentMap = new HashMap<>();
        
        //학생 성적 데이터 추가
        studentMap.put("studentA",50);
        System.out.println("studentMap = " + studentMap);

        //학생이 없는 경우에만 추가1
        if(!studentMap.containsKey("studentA")){
            studentMap.put("studnetA",100);
        }

        // 학생이 없는 경우에만 추가 2
        studentMap.putIfAbsent("studentA",100); // 이미 키 존재해서 추가 없음
        studentMap.putIfAbsent("studentB",100);
        System.out.println("studentMap = " + studentMap);


    }
}
