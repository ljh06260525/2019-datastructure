package io.wisoft.seminar.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

  private final Node rootNode;
  protected final Queue<Node> queue = new LinkedList<>();

  public BinaryTree() {
    this.rootNode = new Node<>();
  }

  public <T> BinaryTree(T data) {
    this.rootNode = new Node<>(data);
  }

  public <T> void addLeft(Node parent, T data) {
    Node<T> node = new Node<>(data);
    if (parent.left == null) {
      parent.left = node;
    } else System.out.println("이미 왼쪽 노드가 존재합니다.");
  }

  public <T> void addRight(Node parent, T data) {
    Node<T> node = new Node<>(data);
    if (parent.right == null) {
      parent.right = node;
    } else System.out.println("이미 오른쪽 노드가 존재합니다.");
  }

  public Node getRootNode() {
    return this.rootNode;
  }

  public void printPreOrder(Node node) {
    if (node != null) {
      System.out.print(node.data + " ");
      printPreOrder(node.left);
      printPreOrder(node.right);
    }
  }

  public void printInOrder(Node node) {
    if (node != null) {
      printInOrder(node.left);
      System.out.print(node.data + " ");
      printInOrder(node.right);
    }
  }

  public void printPostOrder(Node node) {
    if (node != null) {
      printPostOrder(node.left);
      printPostOrder(node.right);
      System.out.print(node.data + " ");
    }
  }

  public void printLevelOrder(Node node) {
    queue.clear();
    queue.add(node);
    while (queue.size() != 0) {
      node = queue.poll();
      System.out.print(node.data + " ");
      if (node.left != null)
        queue.add(node.left);
      if (node.right != null)
        queue.add(node.right);
    }
  }


}
