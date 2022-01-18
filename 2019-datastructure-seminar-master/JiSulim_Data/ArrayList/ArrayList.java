package Chapter02;

public class ArrayList {

  int maxCount;
  int currentCount;
  ArrayListNode[] nodes;

  public ArrayList(int maxCount){
    this.maxCount = maxCount;
    this.nodes = new ArrayListNode[maxCount];
  }

  void addListData(final int position, final int data){
    ArrayListNode node = new ArrayListNode(data);
    for(int i = currentCount-1; i>=position; i--){
      nodes[i+1] = nodes[i];
    }
    nodes[position] = node;
    currentCount++;
  }

  void removeListData(final int position){
    for(int i = position; i<currentCount-1;i++){
      nodes[i] = nodes[i+1];
    }
    currentCount--;
  }

  int getListData(final int position){
    return nodes[position].data;
  }

  void deleteList(){
    for(int i=0; i<currentCount; i++){
      nodes[i] = null;
    }
    currentCount = 0;
  }

  void print(){
    for(int i = 0; i<currentCount;i++){
      int value = getListData(i);
      System.out.println("À§Ä¡ : "+ i + ", °ª : " + value);
    }
  }

}
