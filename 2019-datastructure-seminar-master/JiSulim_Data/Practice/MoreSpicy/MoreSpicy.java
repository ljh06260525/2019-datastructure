package practice;

public class MoreSpicy {

  private int[] nodes;
  private int currentCount;

  public MoreSpicy() {
    currentCount = 0;
    nodes = new int[50];
  }

  public static void main(String[] args) {

    MoreSpicy m = new MoreSpicy();
    int[] scov = {1,2,3,9,10,11};

    System.out.println(m.solution(scov, 7));

    int [] scov2 = {1,2,3};

    System.out.println(m.solution(scov2, 150));

  }

  public int solution(int[] scoville, int k) {
    int answer = 0;

    for(int i=0; i<scoville.length; i++){
      if(k <= 1000000000 && scoville[i] <= 1000000 ){
        insertHeap(scoville[i]);
      }
      else{
        return 0;
      }
    }

    while (nodes != null){
      int val1 = deleteHeap();
      if(val1 < k){
        int mixSco = val1 + 2*deleteHeap();
        insertHeap(mixSco);
        answer++;
        if(nodes[1] == 0 && val1 < k){
          return -1;
        }
      }
      else{
        break;
      }
    }

    return answer;
  }

  public void insertHeap(int value) {
    int i = ++currentCount;
    while ((i != 1) && (value < nodes[i/2])) {
      nodes[i] = nodes[i/2];
      i /= 2;
    }
    nodes[i] = value;
  }

  public int deleteHeap() {
    int parent;
    int child;
    int remove;
    int temp;

    remove = nodes[1];
    temp = nodes[currentCount--];
    parent = 1;
    child = 2;

    while (child <= currentCount) {
      if ((child < currentCount) && (nodes[child] > nodes[child+1]))
        child++;

      if (temp <= nodes[child])
        break;

      nodes[parent] = nodes[child];
      parent =  child;
      child *= 2;
    }

    nodes[parent] = temp;

    return remove;
  }

}
