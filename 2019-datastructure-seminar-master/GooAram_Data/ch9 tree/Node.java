package io.wisoft.datastuct.tree;

public class Node {

    public Object data;
    Node left;
    Node right;

    public Node(Object data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}
