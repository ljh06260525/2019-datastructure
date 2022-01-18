package io.wisoft.datastuct.tree;

import java.util.*;

public class Tree {

    private Queue<Node> nodeQueue = new LinkedList<>();
    private Node newNode;
    private Node rootNode;
    private Node parentNode;

    public void add(Object data) {
        newNode = new Node(data);
        if (nodeQueue.isEmpty()) {
            rootNode = newNode;
            nodeQueue.add(newNode);
        } else {
            parentNode = nodeQueue.peek();
            if (parentNode.left == null) {
                parentNode.left = newNode;
                nodeQueue.add(newNode);
            } else {
                parentNode.right = newNode;
                nodeQueue.add(newNode);
                nodeQueue.poll();
            }
        }
    }

    public Node getRoot() {
        return this.rootNode;
    }

    public void printVLR(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            printVLR(node.left);
            printVLR(node.right);
        }
    }

    public void printLVR(Node node) {
        if (node != null) {
            printLVR(node.left);
            System.out.print(node.data + " ");
            printLVR(node.right);
        }
    }

    public void printLRV(Node node) {
        if (node != null) {
            printLRV(node.left);
            printLRV(node.right);
            System.out.print(node.data + " ");
        }
    }

}