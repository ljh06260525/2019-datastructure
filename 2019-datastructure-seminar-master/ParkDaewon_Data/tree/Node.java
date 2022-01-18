package io.wisoft.seminar.datastructure.tree;

public class Node<T> {

  public T data;
  public Node left = null;
  public Node right = null;

  public Node() {
  }

  public Node(T data) {
    this.data = data;
  }

}
