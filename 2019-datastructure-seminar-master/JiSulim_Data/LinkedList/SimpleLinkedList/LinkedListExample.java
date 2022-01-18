package Chapter03.SimpleLinkedList;

public class LinkedListExample {

  public static void main(String[] args) {

    LinkedList pList = new LinkedList();

    pList = pList.createLinkedList();
    pList.addLinkedListData(pList, 0,10);
    pList.addLinkedListData(pList, 1,20);
    pList.addLinkedListData(pList, 1,30);
    pList.print(pList);
    System.out.println();

    pList.removeLinkedListData(pList, 0);
    pList.print(pList);
    System.out.println();

  }

}
