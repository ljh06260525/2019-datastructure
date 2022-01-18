package Chapter03.SimpleLinkedList;

public class LinkedList {

  int currentCount;
  LinkedListNode header;

  LinkedList(){
    this.header = new LinkedListNode();
  }

  LinkedList createLinkedList(){
    LinkedList pReturn = new LinkedList();

    return pReturn;
  }

  int getLinkedListData(LinkedList pList, int position){

    LinkedListNode pCurrentNode = pList.header.pLink;
    for(int i = 0; i<position; i++){
      pCurrentNode = pCurrentNode.pLink;
    }

    return pCurrentNode.data;

  }

  int addLinkedListData(LinkedList pList, int position, int data){

    LinkedListNode pNewNode = new LinkedListNode(data);
    LinkedListNode pPreNode;

    pPreNode = pList.header;
    for(int i = 0; i<position; i++){
      pPreNode = pPreNode.pLink;
    }

    pNewNode.pLink = pPreNode.pLink;
    pPreNode.pLink = pNewNode;
    pList.currentCount++;

    return 0;

  }

  int removeLinkedListData(LinkedList pList, int position){

    LinkedListNode pDelNode;
    LinkedListNode pPreNode;

    pPreNode = pList.header;
    for(int i=0; i<position; i++){
      pPreNode = pPreNode.pLink;
    }

    pDelNode = pPreNode.pLink;
    pPreNode.pLink =pDelNode.pLink;

    pDelNode = null;
    pList.currentCount--;

    return 0;

  }

  void print(LinkedList pList){
    for(int i = 0; i<currentCount;i++){
      int value = getLinkedListData(pList, i);
      System.out.println("À§Ä¡ : "+ i + ", °ª : " + value);
    }
  }

}
