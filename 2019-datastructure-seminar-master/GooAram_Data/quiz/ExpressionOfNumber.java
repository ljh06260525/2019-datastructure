package io.wisoft.datastuct.programmers;

import java.util.Scanner;

public class ExpressionOfNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number : ");
        int number = scanner.nextInt();
        int result = solution(number);
        System.out.println(result);
    }

    public static int solution(int n) {
        int answer = 1;
        int sum;
        for(int i=0; i<(n/2)+1; i++) {
            sum = 0;
            for(int j=i+1; j<=(n/2)+1; j++) {
                sum += j;
                if(sum == n) {
                    answer++;
                    break;
                } else if (sum >= n) {
                    break;
                }
            }
        }
        return answer;
    }

}