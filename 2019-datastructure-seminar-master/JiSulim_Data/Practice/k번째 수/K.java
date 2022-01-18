package practice;

import java.util.ArrayList;
import java.util.Collections;

public class K {

  public static void main(String[] args) {

    int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
    int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

    K k = new K();
    k.solution(array, commands);

  }

  public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];

    for(int i = 0; i<commands.length; i++){
      ArrayList<Integer> sortedArr = new ArrayList<>();
      System.out.println(commands[i][0]-1);
      System.out.println(commands[i][1]);
      for (int j=commands[i][0]-1; j<commands[i][1]; j++){
        sortedArr.add(array[j]);
      }
      Collections.sort(sortedArr);
      answer[i] = sortedArr.get(commands[i][2]-1);
    }

//    for (int i = 0; i < array.length; i++) {
//      str += array[i];
//    }
//
//    for (int i = 0; i < commands.length; i++) {
//      notSortedArr[i] = str.substring(commands[i][0] - 1, commands[i][1]);
//    }



//    for (int i=0; i<notSortedArr.length; i++){
//      ArrayList<Integer> tmpArr = new ArrayList<>();
//      for (int j=0; j<notSortedArr[i].length(); j++){
//        tmpArr.add(Integer.parseInt(String.valueOf(notSortedArr[i].charAt(j))));
//      }
//      Collections.sort(tmpArr);
//      answer[i] = tmpArr.get(commands[i][2] - 1);
//    }

    System.out.println(answer[0] + " " + answer[1] + " " + answer[2]);

    return answer;
  }

}
