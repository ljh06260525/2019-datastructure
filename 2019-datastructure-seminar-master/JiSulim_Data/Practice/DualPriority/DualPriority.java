package practice;


class DualPriority {
  private int currentCount;
  private int[] nodes;

  public DualPriority() {
    currentCount = 0;
    nodes = new int[100000000];
  }


  public int[] solution(String[] operations){
    int[] answer = new int[2];

    for (int i = 0; i < operations.length; i++) {
      String[] op = operations[i].split(" ");

      if (op[0].equals("I")) {
        insertHeap(Integer.parseInt(op[1]));
      } else if (op[1].equals("1") && currentCount != 0) {
        deleteMaxHeap();
      } else if (op[1].equals("-1") && currentCount != 0) {
        deleteMinHeap();
      }
    }

    if (currentCount != 0) {
      answer[0] = deleteMaxHeap();
      answer[1] = deleteMinHeap();
    }

    return answer;
  }

  public void insertHeap(int value) {
    int i = ++currentCount;
    while ((i != 1) && (value <= nodes[i / 2])) {
      if (value == nodes[i / 2]) {

      } else {
        nodes[i] = nodes[i / 2];
        i /= 2;
      }
    }
    nodes[i] = value;
  }

  public int deleteMaxHeap(){
    int check = 0;  //최대값을 가지고 있는 인덱스 번호

    int max = 0;
    for (int i = 1; i <= currentCount; i++) {
      if (max < nodes[i]) {
        max = nodes[i];
        check = i;
      }
    }

    int[] temporaryArray = new int[currentCount - check];

    nodes[check++] = 0;
    currentCount--;


    for (int i = 0; i < temporaryArray.length; i++) {
      temporaryArray[i] = nodes[check];
      nodes[check] = 0;
      currentCount--;
      check++;
    }


    for (int i = 0; i < temporaryArray.length; i++) {
      insertHeap(temporaryArray[i]);
    }

    return max;
  }

  public int deleteMinHeap() {
    int parent, child;
    int remove;
    int temp;

    remove = nodes[1];
    temp = nodes[currentCount--];
    parent = 1;
    child = 2;

    while (child <= currentCount) {
      if ((child < currentCount) && (nodes[child] > nodes[child + 1]))
        child++;

      if (temp <= nodes[child])
        break;

      nodes[parent] = nodes[child];
      parent = child;
      child *= 2;
    }

    nodes[parent] = temp;

    return remove;
  }
}