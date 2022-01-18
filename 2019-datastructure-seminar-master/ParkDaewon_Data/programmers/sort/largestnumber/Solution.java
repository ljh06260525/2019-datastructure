package io.wisoft.seminar.programmers.largestnumber;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

  public String solution(int[] numbers) {
    String answer = Arrays.stream(numbers)
        .mapToObj(Integer::toString)
        .sorted((a, b) -> (b + a).compareTo(a + b))
        .collect(Collectors.joining());
    return answer.startsWith("0") ? "0" : answer;
  }

  //  public String solution(int[] numbers) {
//    StringBuilder answer = new StringBuilder();
//    Arrays.stream(numbers)
//        .mapToObj(Integer::toString)
//        .sorted((a, b) -> (b + a).compareTo(a + b))
//        .forEach(answer::append);
//
//    return answer.charAt(0) == '0' ? "0" : answer.toString();
//  }

  public static void main(String[] args) {
    Solution largestNumber = new Solution();
    System.out.println(
        largestNumber.solution(new int[]{3, 30, 34, 5, 9}));
  }

}