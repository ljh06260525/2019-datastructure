package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Progress {

  public int[] solution(int[] progresses, int[] speeds) {

    int[] answer;
    Queue<Integer> dayQueue = new LinkedList<>();
    Stack<Integer> countStack = new Stack<>();


    int day = 0;
    int count = 1;

    for (int i = 0; i < progresses.length; i++) {
      int proVal = progresses[i];
      while (proVal < 100) {
        proVal += speeds[i];
        day++;
      }

      dayQueue.offer(day);

      day = 0;

    }
    System.out.println(dayQueue);

    int value = dayQueue.poll();

    while (!dayQueue.isEmpty()) {

      if (value >= dayQueue.peek()) {
        dayQueue.poll();
        count++;
      } else {
        countStack.push(count);
        value = dayQueue.poll();
        count = 1;
      }

    }
    countStack.push(count);


    answer = new int[countStack.size()];
    System.out.println(countStack);

    for (int i = answer.length - 1; i > -1; i--) {
      answer[i] = countStack.pop();
    }


    return answer;
  }

  public static void main(String[] args) {
    Progress progress = new Progress();

    int[] d = {93, 30, 55};
    int[] speed = {1, 30, 5};

    progress.solution(d, speed);

    System.out.println();
    int[] a = {90, 85, 90, 95};
    int[] b = {5, 5, 5, 5};
    progress.solution(a, b);

  }

}
