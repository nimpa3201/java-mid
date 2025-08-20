package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;
public class TaskScheduler {
    private Queue<Task> tasks = new ArrayDeque<>();

    public void addTask(Task task) {
        tasks.offer(task);

    }

    public int getRemainingTasks() {
        return tasks.size();
    }

    public void processNextTask() {
        Task poll = tasks.poll();
        if(poll!=null){
           poll.execute();
        }
    }
// 코드 작성
}

/*
작업 시작
데이터 압축...
자료 백업...
사용하지 않는 자원 정리...
작업 완료
 */