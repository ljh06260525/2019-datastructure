package Chapter02;

public class ArrayListExample {

  public static void main(String[] args) {

    ArrayList arrayList = new ArrayList(5);

    arrayList.addListData(0, 10);
    arrayList.addListData(1, 20);
    arrayList.addListData(0, 30);
    arrayList.print();
    System.out.println("=========");

    arrayList.removeListData(1);
    arrayList.print();
    System.out.println("=========");

    arrayList.deleteList();
    arrayList.print();
    System.out.println("=========");


  }

}
