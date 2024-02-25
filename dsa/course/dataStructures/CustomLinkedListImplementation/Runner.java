package dsa.course.dataStructures.CustomLinkedListImplementation;

public class Runner {
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.add(15);
        linkedList.add(1);
        linkedList.add(14);
        linkedList.add(115);
        linkedList.add(415);
        linkedList.add(195);
        linkedList.addAtStart(547);
        linkedList.addAt(3,3);
        linkedList.addAt(0,0);
        linkedList.delete(3);
        linkedList.delete(0);

        linkedList.show();

    }
}
