package Chapter03.PolynomialLinkedList;

public class LinkedList {

  protected int currentCount;
  LinkedListNode header;

  LinkedList(){

    this.header = new LinkedListNode();

  }

//  public Term getData(LinkedList pList, int position){
//
//    LinkedListNode pCurrentNode = pList.header.pLink;
//    for(int i = 0; i<position; i++){
//      pCurrentNode = pCurrentNode.pLink;
//    }
//
//    return pCurrentNode.data;
//
//  }

  public int addData(LinkedList pList, int position, Data data){

    LinkedListNode pNewNode = new LinkedListNode(data);
    LinkedListNode pPreNode;

    pNewNode.data = data;

    pPreNode = pList.header;
    for(int i = 0; i<position; i++){
      pPreNode = pPreNode.pLink;
    }

    pNewNode.pLink = pPreNode.pLink;
    pPreNode.pLink = pNewNode;
    pList.currentCount++;

    return 1;

  }



//  public int removeData(LinkedList pList, int position){
//    LinkedListNode pDelNode;
//    LinkedListNode pPreNode;
//
//    pPreNode = pList.header;
//    for(int i=0; i<position; i++){
//      pPreNode = pPreNode.pLink;
//    }
//
//    pDelNode = pPreNode.pLink;
//    pPreNode.pLink =pDelNode.pLink;
//
//    pDelNode = null;
//    pList.currentCount--;
//
//    return 0;
//  }

}
