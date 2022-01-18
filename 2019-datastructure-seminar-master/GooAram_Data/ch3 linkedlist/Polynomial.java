package io.wisoft.datastuct.quiz.polynomial;

import java.util.Scanner;

public class Polynomial {

    private Node head;
    private Node tail;
    private int size = 0;

    private void add(int coef, int degree) {
        if (size == 0) {
            Node newNode = new Node(coef, degree);
            newNode.next = head;
            head = newNode;
            tail = head;
            size++;
        } else {
            Node newNode = new Node(coef, degree);
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void input_and_link() {
        Scanner scanner = new Scanner(System.in);
        int coef;
        int degree;
        System.out.print("항의 개수 : ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("coef : ");
            coef = scanner.nextInt();
            System.out.print("degree : ");
            degree = scanner.nextInt();

            add(coef, degree);
        }
    }

    public void sum(Polynomial polynomial1, Polynomial polynomial2) {
        Node node1 = polynomial1.head;
        Node node2 = polynomial2.head;
        int sum_coef;

        while (node1 != null && node2 != null) {
            if (node1.degree == node2.degree) {
                sum_coef = node1.coef + node2.coef;
                if (sum_coef == 0) {
                    node1 = node1.next;
                    node2 = node2.next;
                } else {
                    add(sum_coef, node1.degree);
                    node1 = node1.next;
                    node2 = node2.next;
                }

            } else if (node1.degree > node2.degree) {
                add(node1.coef, node1.degree);
                node1 = node1.next;
            } else if (node1.degree < node2.degree) {
                add(node2.coef, node2.degree);
                node2 = node2.next;
            }
        }
        while (node1 != null) {
            add(node1.coef, node1.degree);
            node1 = node1.next;
        }
        while (node2 != null) {
            add(node2.coef, node2.degree);
            node2 = node2.next;
        }

    }

    public void sub(Polynomial polynomial1, Polynomial polynomial2) {
        Node node1 = polynomial1.head;
        Node node2 = polynomial2.head;
        int sub_coef;
        while (node1 != null && node2 != null) {
            if (node1.degree == node2.degree) {
                sub_coef = node1.coef - node2.coef;
                if (sub_coef == 0) {
                    node1 = node1.next;
                    node2 = node2.next;
                } else {
                    add(sub_coef, node1.degree);
                    node1 = node1.next;
                    node2 = node2.next;
                }
            } else if (node1.degree > node2.degree) {
                add(node1.coef, node1.degree);
                node1 = node1.next;
            } else {
                add(node2.coef, node2.degree);
                node2 = node2.next;
            }
        }

        while (node1 != null) {
            add(node1.coef, node1.degree);
            node1 = node1.next;
        }
        while (node2 != null) {
            add(node2.coef, node2.degree);
            node2 = node2.next;
        }


    }

    public String printlist() {
        StringBuffer result = new StringBuffer();
        Node node = head;
        if (node != null) {
            result.append(node.coef);
            result.append("x^");
            result.append(node.degree);
            node = node.next;
            while (node != null) {
                result.append(" + ");
                result.append(node.coef);
                result.append("x^");
                result.append(node.degree);
                node = node.next;
            }
        }
        return result.toString();
    }

}