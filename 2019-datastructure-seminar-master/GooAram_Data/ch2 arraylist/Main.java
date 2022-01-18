package io.wisoft.datastructure_seminar.array_list;

public class Main {

    public static void main(String[] args) {
        Node[] list= new Node[5];
        ArrayList arrayList = new ArrayList();
        arrayList.addListData(list, 0, 10);
        arrayList.addListData(list,1,20);
        arrayList.addListData(list,1,30);
        arrayList.addListData(list,1,40);
        arrayList.addListData(list,1,50);

        for(int i=0; i<arrayList.currentCount; i++) {
            System.out.print(list[i].data + "  ");
        }

        System.out.println();

        arrayList.removeData(list,2);

        for(int i=0; i<arrayList.currentCount; i++) {
            System.out.print(list[i].data + "  ");
        }
        System.out.println();
        System.out.println(arrayList.getListData(list,3));

        arrayList.deleteList(list);
        for(int i=0; i<arrayList.currentCount; i++) {
            System.out.print(list[i].data + "  ");
        }
    }

}
