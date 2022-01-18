# Stack.Programmers. 탑

## 1. 문제 설명

- 수평 직선에 탑 N대를 세웠습니다. 모든 탑의 꼭대기에는 신호를 송/수신하는 장치를 설치했습니다. 발사한 신호는 신호를 보낸 탑보다 높은 탑에서만 수신합니다. 또한, 한 번 수신된 신호는 다른 탑으로 송신되지 않습니다.
- ex) 예를 들어 높이가 6, 9, 5, 7, 4인 다섯 탑이 왼쪽으로 동시에 레이저 신호를 발사합니다. 그러면, 탑은 다음과 같이 신호를 주고받습니다. 높이가 4인 다섯 번째 탑에서 발사한 신호는 높이가 7인 네 번째 탑이 수신하고, 높이가 7인 네 번째 탑의 신호는 높이가 9인 두 번째 탑이, 높이가 5인 세 번째 탑의 신호도 높이가 9인 두 번째 탑이 수신합니다. 높이가 9인 두 번째 탑과 높이가 6인 첫 번째 탑이 보낸 레이저 신호는 어떤 탑에서도 수신할 수 없습니다.



``` java
import java.util.Stack;

class StackPractice {

  public int[] solution(int[] heights) {
    int[] answer = new int[heights.length];

    for (int i = 0; i < heights.length; i++) {    //answer에 대한 인덱스
      Stack<Integer> stack = new Stack<>();
      for(int j = 0; j<=i; j++){    //heights에 대한 인덱스
        stack.push(heights[j]);
      }
      while (!stack.isEmpty()){
        if(heights[i] < stack.peek()){
          answer[i] = stack.size();
          break;
        }
        else{
          stack.pop();
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {

    StackPractice stack = new StackPractice();

    int heights[] = {6,9,5,7,4};
    for(int i = 0; i<heights.length;i++){
      System.out.print(heights[i] +", ");
    }
    System.out.println();

    int result[] = stack.solution(heights);

    for(int i = 0; i<result.length; i++){
      System.out.print(result[i] + ", ");
    }
  }

}

```

