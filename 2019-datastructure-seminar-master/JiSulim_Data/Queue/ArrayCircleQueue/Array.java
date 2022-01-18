package Chapter05.ArrayCircleQueue;

public class Array {

  private final int MAX_COUNT;
  private int currentCount;
  private int front;
  private int rear;
  private Node[] pData;

  public Array(final int maxCount) {
    front = -1;
    rear = -1;
    this.MAX_COUNT = maxCount;
    this.pData = new Node[maxCount];
  }

  int enqueue(Array pQueue, char data) {
    int ret = 0;

    Node newNode = new Node(data);

    if (pQueue != null) {
      if (isFull(pQueue) == 0) {
        pQueue.rear = (pQueue.rear + 1) % pQueue.MAX_COUNT;
        pQueue.pData[pQueue.rear] = newNode;
        pQueue.currentCount++;
      } else {
        System.out.println("오류, 큐가 가득 찼습니다.");
      }
    }

    return ret;

  }

  Node dequeue(Array pQueue) {

    Node pReturn = new Node();

    if (pQueue != null) {
      if (isEmpty(pQueue) == 0) {
        if (pReturn != null) {
          pQueue.front = (pQueue.front + 1) % pQueue.MAX_COUNT;
          pReturn.data = pQueue.pData[pQueue.front].data;
          pQueue.currentCount--;
        } else {
          System.out.println("오류, 메모리 할당");
        }
      }
    }
    return pReturn;
  }

  Node peek(Array pQueue) {
    Node pReturn = new Node();
    if (pQueue != null) {
      if (isEmpty(pQueue) == 0) {
        pReturn = pQueue.pData[pQueue.front + 1];
      }
    }

    return pReturn;

  }

  int isFull(Array pQueue) {
    int ret = 0;

    if (pQueue != null) {
      if (pQueue.currentCount == pQueue.MAX_COUNT) {
        ret = 1;
      }
    }
    return ret;
  }

  int isEmpty(Array pQueue) {
    int ret = 0;
    if (pQueue != null) {
      if (pQueue.currentCount == 0) {
        ret = 1;
      }
    }

    return ret;
  }

  void display(Array pQueue) {
    int position = 0;

    if (pQueue != null) {
      System.out.println("큐의 크기 : " + pQueue.MAX_COUNT + "현재 노드 개수 : " + pQueue.currentCount);

      for (int i = pQueue.front + 1; i <= pQueue.front + pQueue.currentCount; i++) {
        position = i % pQueue.MAX_COUNT;
        System.out.println("[ " + position + " ]-[ " + pQueue.pData[position].data + " ]");
      }
    }
  }

}
