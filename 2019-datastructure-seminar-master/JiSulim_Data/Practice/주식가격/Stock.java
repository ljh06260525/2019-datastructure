package practice;

class Stock {
  public int[] solution(int[] prices) {
    int[] answer = new int[prices.length];

    for(int i = 0; i < prices.length; i++){
      int count = 0;
      for(int j = i+1; j < prices.length; j++){
        if(prices[i] <= prices[j]){
          count++;
        }
        else{
          count++;
          break;
        }
      }
      answer[i] = count;
    }

    return answer;
  }

  public static void main(String[] args) {
    Stock stock = new Stock();
    int[] prices = {1,2,3,2,3};
    int[] time = stock.solution(prices);

    for(int i = 0; i<prices.length; i++){
      System.out.print(prices[i] + " ");
    }
    System.out.println();
    for(int i = 0; i<prices.length; i++){
      System.out.print(time[i] + " ");
    }
  }
}
