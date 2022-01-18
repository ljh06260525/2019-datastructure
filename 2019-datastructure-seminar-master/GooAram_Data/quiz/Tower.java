package io.wisoft.datastuct.quiz.programmers;

public class Tower {

    private static int top;

    private static int pop(int[] heights) {
        int result = heights[top];
        heights[top] = 0;
        top--;
        return result;
    }

    public static void main(String[] args) {
        int[] heights = {6, 9, 5, 7, 4};

        top = heights.length - 1;
        int[] answer = new int[top+1];

        while(top != 0) {
            int result = pop(heights);
            for(int i=top; i>-1; i--) {
                if(result < heights[i]) {
                    answer[top+1] = i+1;
                    break;
                } else {
                    answer[top+1] = 0;
                }
            }
        }
        answer[0] = 0;

        for (int value : answer) {
            System.out.println(value);
        }
    }

}