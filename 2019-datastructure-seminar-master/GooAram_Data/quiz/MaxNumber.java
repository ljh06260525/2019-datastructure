package io.wisoft.datastuct.quiz.programmers;

import java.util.Arrays;

public class MaxNumber {

    public static String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] array = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            array[i] = String.valueOf(numbers[i]);
        }


        Arrays.sort(array, (s1, s2) -> (s2 + s1).compareTo(s1 + s2)); //조합해서 큰 값을 앞으로 보내기 위함

        if (array[0].equals("0")) {
            return "0";
        }

        for (String s : array) {
            answer.append(s);
        }

        return answer.toString();
    }


    public static void main(String[] args) {
        int[] numbers = {6, 19, 2};
        System.out.println(solution(numbers));
    }

}


