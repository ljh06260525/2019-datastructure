package io.wisoft.datastuct.queue;

public class CircularQueue {

    int maxsize;
    static int rear = 0;
    static int front = 0;
    Object[] circularQueue;

    public CircularQueue(int maxsize) {
        this.maxsize = maxsize;
        circularQueue = new Object[this.maxsize];
    }

    public void add(Object data) {
        if((rear+1) % maxsize == front) {
            System.out.println("full");
        } else {
            rear = (rear + 1) % maxsize;
            circularQueue[rear] = data;
        }
    }

    public Object poll() {
        front = (front+1) % maxsize;
        Object result = circularQueue[front];
        circularQueue[front] = null;
        return result;
    }

    public void print() {
        for(int i=1; i<maxsize; i++) {
            System.out.print(circularQueue[i] + " ");
        }
    }

}
