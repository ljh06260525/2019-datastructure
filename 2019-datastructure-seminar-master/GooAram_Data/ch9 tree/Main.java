package io.wisoft.datastuct.tree;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add("A");
        tree.add("B");
        tree.add("C");
        tree.add("D");
        tree.add("E");
        tree.add("F");
        tree.add("G");
        tree.printVLR(tree.getRoot());
        System.out.println();
        tree.printLVR(tree.getRoot());
        System.out.println();
        tree.printLRV(tree.getRoot());
    }

}
