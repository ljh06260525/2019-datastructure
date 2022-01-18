package io.wisoft.datastuct.heap;

public class Heap {

    Node newNode;
    Node[] heapArray;
    static int currentCount = 0;

    public void addNode(int data) {
        newNode = new Node(data);
        if (heapArray == null) {
            heapArray = new Node[100];
            heapArray[++currentCount] = newNode;
        } else {
            heapArray[++currentCount] = newNode;
            for (int i = currentCount; i>1; i/=2) {
                if (heapArray[i/2].data < heapArray[i].data) {
                    Node temp;
                    temp = heapArray[i];
                    heapArray[i] = heapArray[i / 2];
                    heapArray[i / 2] = temp;

                } else {
                    break;
                }
            }
        }
    }

    public void print() {
        int i = 1;
        while (heapArray[i] != null) {
            System.out.print(heapArray[i++].data + " ");
        }
        System.out.println();
    }

    public void deleteNode() {
        heapArray[1] = heapArray[currentCount];
        heapArray[currentCount--] = null;

        for (int i=1; i*2<currentCount;) {
            if (heapArray[i].data > heapArray[i*2].data && heapArray[i].data > heapArray[i*2+1].data) {
                break;
            } else if (heapArray[i].data < heapArray[i*2].data) {
                Node temp = heapArray[i];
                heapArray[i] = heapArray[i*2];
                heapArray[i*2] = temp;
                i *= 2;
            } else {
                Node temp = heapArray[i];
                heapArray[i] = heapArray[i*2+1];
                heapArray[i*2+1] = temp;
                i = i*2+1;
            }
        }
    }

}