package Chapter05.ArrayCircleQueue;

public class ArrayCircleQueueExample {

  public static void main(String[] args) {

    Array pQueue = new Array(4);
    Node pNode;

    if(pQueue != null){
      pQueue.enqueue(pQueue, 'A');
      pQueue.enqueue(pQueue, 'B');
      pQueue.enqueue(pQueue, 'C');
      pQueue.enqueue(pQueue, 'D');

      pQueue.display(pQueue);

      pNode = pQueue.dequeue(pQueue);
      if(pNode!=null){
        System.out.println("Dequeue Value - [ " + pNode.data + " ]");
        pNode = null;
      }
      pQueue.display(pQueue);

      pNode = pQueue.peek(pQueue);
      if(pNode != null){
        System.out.println("Peek Value - [ " + pNode.data + " ]");
      }
      pQueue.display(pQueue);

      pQueue.enqueue(pQueue, 'E');
      pQueue.display(pQueue);

    }

  }

}
