package io.wisoft.datastuct.heap;

public class Main {

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.addNode(1);
        heap.addNode(2);
        heap.addNode(3);
        heap.addNode(4);
        heap.addNode(5);
        heap.addNode(6);
        heap.addNode(7);
        heap.print();

        heap.deleteNode();
        heap.deleteNode();
        heap.print();
    }

}
