package Chapter09.BTree;

public class main {

  public static void main(String[] args) {

    BTree bTree = new BTree();
    bTree = bTree.createBTree();

    if(bTree != null){
      System.out.print("전위 순회 결과 : ");
      bTree.VLR(bTree);
      System.out.print("중위 순회 결과 : ");
      bTree.LVR(bTree);
      System.out.print("후위 순회 결과 : ");
      bTree.LRV(bTree);
    }

  }

}
