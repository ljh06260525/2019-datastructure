package practice;

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
