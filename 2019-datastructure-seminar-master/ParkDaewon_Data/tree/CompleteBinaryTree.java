package io.wisoft.seminar.datastructure.tree;

public class CompleteBinaryTree extends BinaryTree {

  private final Node rootNode;

  public <T> CompleteBinaryTree(T data) { this.rootNode = new Node<>(data); }

  @Override
  public Node getRootNode() {
    return this.rootNode;
  }

  public <T> void insert(T data) {
    queue.add(this.rootNode);
    Node node;

    while (queue.size() != 0) {
      node = queue.poll();

      if (node.left != null)
        queue.add(node.left);
      else {
        node.left = new Node<>(data);
        break;
      }

      if (node.right != null)
        queue.add(node.right);
      else {
        node.right = new Node<>(data);
        break;
      }
    }
  }

}
