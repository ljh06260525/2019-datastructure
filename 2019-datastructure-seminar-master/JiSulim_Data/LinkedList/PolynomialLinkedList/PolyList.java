package Chapter03.PolynomialLinkedList;

public class PolyList extends LinkedList {

  PolyList() {
  }


  public int PolyNodeLast(PolyList pList, double coef, int degree) {

    Term term = new Term();
    term.coef = coef;
    term.degree = degree;


    int position, ret = 0;
    if (pList != null) {
      position = pList.currentCount;
      ret = addData(pList, position, term);
    }

    return ret;

  }

  public void displayPolyList(PolyList pList) {

    LinkedListNode pNode;
    pNode = pList.header.pLink;
    if (pList.currentCount == 0) {
      System.out.println("자료가 없습니다.");
    } else {
      for (int i = 0; i < pList.currentCount; i++) {
        if (i>0 && ((Term)pNode.data).coef > 0) {
          System.out.print(" + ");
        }
        else{
          System.out.print(" ");
        }
        System.out.print(((Term)pNode.data).coef + "^" + ((Term)pNode.data).degree);
        pNode = pNode.pLink;
      }
      System.out.println("\n=====================");
    }

  }

  public PolyList polyAdd(PolyList pListA, PolyList pListB) {

    PolyList pReturn = new PolyList();
    LinkedListNode pNodeA;
    LinkedListNode pNodeB;
    double coefSum = 0;

    if (pListA != null && pListB != null) {
      pReturn = new PolyList();
      if (pReturn == null) {
        System.out.println("메모리 할당 오류, PolyAdd");
        return null;
      }

      pNodeA = pListA.header.pLink;
      pNodeB = pListB.header.pLink;
      while (pNodeA != null && pNodeB != null) {
        Term termA = (Term)pNodeA.data;
        Term termB = (Term)pNodeB.data;

        int degreeA = termA.degree;
        int degreeB = termB.degree;
        if (degreeA > degreeB) {
          coefSum = termA.coef;
          PolyNodeLast(pReturn, coefSum, degreeA);
          pNodeA = pNodeA.pLink;
        } else if (degreeA == degreeB) {
          coefSum = termA.coef + termB.coef;
          PolyNodeLast(pReturn, coefSum, degreeA);
          pNodeA = pNodeA.pLink;
          pNodeB = pNodeB.pLink;
        } else {
          coefSum = termB.coef;
          PolyNodeLast(pReturn, coefSum, degreeB);
          pNodeB = pNodeB.pLink;
        }
      }

      while (pNodeA != null) {
        Term termA = (Term)pNodeA.data;

        coefSum = termA.coef;
        PolyNodeLast(pReturn, coefSum, termA.degree);
        pNodeA = pNodeA.pLink;
      }

      while (pNodeB != null) {
        Term termB = (Term)pNodeB.data;

        coefSum = termB.coef;
        PolyNodeLast(pReturn, coefSum, termB.degree);
        pNodeB = pNodeB.pLink;
      }

    } else {
      System.out.println("오류, Null 다항식이 전달되었습니다. polyAdd()");
    }

    return pReturn;

  }

  public PolyList polySub(PolyList pListA, PolyList pListB){
    PolyList pReturn = new PolyList();
    LinkedListNode pNodeA;
    LinkedListNode pNodeB;
    double coefSub = 0;

    if (pListA != null && pListB != null) {
      pReturn = new PolyList();
      if (pReturn == null) {
        System.out.println("메모리 할당 오류, PolyAdd");
        return null;
      }

      pNodeA = pListA.header.pLink;
      pNodeB = pListB.header.pLink;

      while (pNodeA != null && pNodeB != null) {
        Term termA = (Term)pNodeA.data;
        Term termB = (Term)pNodeB.data;

        int degreeA = termA.degree;
        int degreeB = termB.degree;
        if (degreeA > degreeB) {
          coefSub = termA.coef;
          PolyNodeLast(pReturn, coefSub, degreeA);
          pNodeA = pNodeA.pLink;
        } else if (degreeA == degreeB) {
          coefSub = termA.coef - termB.coef;
          PolyNodeLast(pReturn, coefSub, degreeA);
          pNodeA = pNodeA.pLink;
          pNodeB = pNodeB.pLink;
        } else {
          coefSub = -termB.coef;
          PolyNodeLast(pReturn, coefSub, degreeB);
          pNodeB = pNodeB.pLink;
        }
      }

      while (pNodeA != null) {
        Term termA = (Term)pNodeA.data;

        coefSub = termA.coef;
        PolyNodeLast(pReturn, coefSub, termA.degree);
        pNodeA = pNodeA.pLink;
      }

      while (pNodeB != null) {
        Term termB = (Term)pNodeB.data;

        coefSub = -termB.coef;
        PolyNodeLast(pReturn, coefSub, termB.degree);
        pNodeB = pNodeB.pLink;
      }

    } else {
      System.out.println("오류, Null 다항식이 전달되었습니다. polyAdd()");
    }

    return pReturn;

    }

}