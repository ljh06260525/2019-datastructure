package io.wisoft.datastuct.quiz.polynomial;

public class Node {

    public Node next;
    int coef;
    int degree;

    Node (int coef, int degree) {
        this.coef = coef;
        this.degree = degree;
        this.next = null;
    }

}
