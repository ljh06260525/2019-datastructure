package io.wisoft.datastuct.quiz.programmers;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Printer {

    public static int solution(int[] priorities, int location) {
        int answer = 1;

        PriorityQueue priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for(int data : priorities) {
            priorityQueue.add(data);
        }

        while(!priorityQueue.isEmpty()) {
            for(int i=0; i<priorities.length; i++) {
                if(priorities[i] == (int)priorityQueue.peek()) {
                    if(location == i) {
                        answer = i+1;
                        return answer;
                    }
                    priorityQueue.poll();
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] priority = {1, 1, 9, 1, 1, 1};
        int result = Printer.solution(priority,0);
        System.out.println(result);
    }

}
