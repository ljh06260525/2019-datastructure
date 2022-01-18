package practice;

import java.util.Arrays;

public class GcdLcm {

  public static void main(String[] args) {
    GcdLcm gl = new GcdLcm();
    System.out.println(Arrays.toString(gl.gcdlcm(3,12)));
    System.out.println(Arrays.toString(gl.gcdlcm(2,5)));

  }

  public int[] gcdlcm(int n, int m) {
    int[] answer = new int[2];
    for (int i = 1; i <= n; i++) {
      //최대공약수
      if (n % i == 0) {
        for (int j = 1; j <= m; j++) {
          if ((i == j) && (m % j == 0)) {
            answer[0] = i;
          }
        }
      }
    }

    for (int i = 1; i <= (n * m); i++) {
      if ((n % i == 0) && (m % i == 0)) {
        answer[1] = i * (n / i) * (m / i);
      }
    }

    return answer;
  }

}
