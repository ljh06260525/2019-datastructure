package io.wisoft.datastuct.quiz.polynomial;

public class Main {

    public static void main(String[] args) {
        Polynomial polynomial1 = new Polynomial();
        Polynomial polynomial2 = new Polynomial();

        System.out.println("===== 다항식1 입력 =====");
        polynomial1.input_and_link();
        System.out.println("===== 다항식2 입력 =====");
        polynomial2.input_and_link();

        System.out.println();
        System.out.println("다항식1 = " + polynomial1.printlist());
        System.out.println("다항식2 = " + polynomial2.printlist());

        Polynomial polynomial_sum = new Polynomial();
        Polynomial polynomial_mul = new Polynomial();

        polynomial_sum.sum(polynomial1, polynomial2);
        polynomial_mul.sub(polynomial1, polynomial2);

        System.out.println();
        System.out.println("다항식의 합 = " + polynomial_sum.printlist());
        System.out.println("다항식의 차 = " + polynomial_mul.printlist());
    }

}
