package io.wisoft.seminar.datastructure.tree;

public class Main {

  public static void main(String[] args) {
    CompleteBinaryTree tree = new CompleteBinaryTree('A');
    tree.insert('B');
    tree.insert('C');
    tree.insert('D');
    tree.insert('E');
    tree.insert('F');
    tree.insert('G');

    System.out.print("전위 순회 : ");
    tree.printPreOrder(tree.getRootNode());
    System.out.println();

    System.out.print("중위 순회 : ");
    tree.printInOrder(tree.getRootNode());
    System.out.println();

    System.out.print("후위 순회 : ");
    tree.printPostOrder(tree.getRootNode());
    System.out.println();

    System.out.print("레벨 순회 : ");
    tree.printLevelOrder(tree.getRootNode());
    System.out.println();
  }

}
