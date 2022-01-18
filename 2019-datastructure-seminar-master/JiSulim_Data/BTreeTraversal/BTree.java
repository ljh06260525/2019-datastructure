package Chapter09.BTree;

public class BTree {

  Node rootNode;

  public Node makeNewNodeBT(char data) {

    Node pReturn = new Node();

    if (pReturn != null) {
      pReturn.data = data;
      pReturn.LLink = null;
      pReturn.RLink = null;
    }

    return pReturn;

  }

  public BTree makeBTree(char rootNodeData) {
    BTree pReturn = new BTree();
    if (pReturn != null) {
      pReturn.rootNode = makeNewNodeBT(rootNodeData);
      if (pReturn.rootNode == null) {
        pReturn = null;
        System.out.println("오류, 메모리 할당");
      }
    } else {
      System.out.println("오류, 메모리 할당");
    }

    return pReturn;
  }

  public BTree createBTree() {
    BTree pReturn;
    Node nodeA;
    Node nodeB;
    Node nodeC;

    pReturn = makeBTree('A');
    if (pReturn != null) {
      nodeA = getRootNode(pReturn);
      nodeB = addLLink(nodeA, 'B');
      nodeC = addRLink(nodeA, 'C');
      if (nodeB != null) {
        addLLink(nodeB, 'D');
        addRLink(nodeB, 'E');
      }
      if (nodeC != null) {
        addLLink(nodeC, 'F');
        addRLink(nodeC, 'G');
      }
    }
    return pReturn;
  }

  public Node addLLink(Node root, char data) {

    Node pReturn = new Node();
    if (root != null) {
      if (root.LLink == null) {
        root.LLink = makeNewNodeBT(data);
        pReturn = root.LLink;
      } else {
        System.out.println("노드가 이미 존재합니다.");
      }
    }

    return pReturn;

  }

  public Node addRLink(Node root, char data) {

    Node pReturn = new Node();
    if (root != null) {
      if (root.RLink == null) {
        root.RLink = makeNewNodeBT(data);
        pReturn = root.RLink;
      } else {
        System.out.println("노드가 이미 존재합니다.");
      }
    }

    return pReturn;

  }

  public Node getRootNode(BTree pBTree) {

    Node pReturn = null;

    if (pBTree != null) {
      pReturn = pBTree.rootNode;
    }

    return pReturn;

  }

  public void VLR(BTree tree) {
    if (tree != null) {
      VLRNode(tree.rootNode);
      System.out.println();
    }
  }

  public void VLRNode(Node node) {
    if (node != null) {
      System.out.print(node.data);
      VLRNode(node.LLink);
      VLRNode(node.RLink);
    }
  }

  public void LVR(BTree tree) {
    if (tree != null) {
      LVRNode(tree.rootNode);
      System.out.println();
    }
  }

  public void LVRNode(Node node) {
    if (node != null) {
      LVRNode(node.LLink);
      System.out.print(node.data);
      LVRNode(node.RLink);
    }
  }

  public void LRV(BTree tree) {
    if (tree != null) {
      LRVNode(tree.rootNode);
      System.out.println();
    }
  }

  public void LRVNode(Node node) {
    if (node != null) {
      LRVNode(node.LLink);
      LRVNode(node.RLink);
      System.out.print(node.data);
    }
  }

}
