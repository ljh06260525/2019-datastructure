package Chapter03.PolynomialLinkedList;

import java.util.Scanner;

public class PolynomialLinkedListExample {

  Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    PolynomialLinkedListExample polynomial = new PolynomialLinkedListExample();

    PolyList pListA = new PolyList();
    PolyList pListB = new PolyList();
    PolyList pListC = new PolyList();


    System.out.println("pListA�� �Է����ּ���.");
    polynomial.exitInput(pListA);

    System.out.println("pListB�� �Է����ּ���.");
    polynomial.exitInput(pListB);

    pListC = pListC.polyAdd(pListA, pListB);
    System.out.print("�� : ");
    if(pListC != null){
      pListC.displayPolyList(pListC);
    }

    pListC = pListC.polySub(pListA, pListB);
    System.out.print("�� : ");
    if(pListC != null){
      pListC.displayPolyList(pListC);
    }

  }

  public void exitInput(PolyList pList) {

    while (true) {
      int coef = scanner.nextInt();
      if (coef == 0) {
        break;
      }
      int degree = scanner.nextInt();

      pList.PolyNodeLast(pList, coef, degree);
    }
    pList.displayPolyList(pList);

  }

}
