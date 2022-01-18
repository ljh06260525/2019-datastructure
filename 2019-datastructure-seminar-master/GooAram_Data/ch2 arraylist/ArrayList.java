package io.wisoft.datastructure_seminar.array_list;

public class ArrayList {

    int currentCount;
    Node nodes;

    public ArrayList() {
        this.currentCount = 0;
    }

    void addListData(Node[] list, int position, int data) {
        nodes = new Node(data);
        for(int i=currentCount-1; i>=position; i--) {
            list[i+1] = list[i];
        }
        list[position] = nodes;
        currentCount++;
    }

    void removeData(Node[] list, int position) {
        for(int i=position; i<currentCount-1; i++) {
            list[i] = list[i+1];
        }
        currentCount--;
    }

    void deleteList(Node[] list) {
        for(int i=0; i<list.length; i++) {
            list[i]=null;
        }
    }

    int getListData(Node[] list, int position) {
        return list[position].data;
    }


}
