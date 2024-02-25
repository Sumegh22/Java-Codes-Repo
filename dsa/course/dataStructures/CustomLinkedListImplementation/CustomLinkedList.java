package dsa.course.dataStructures.CustomLinkedListImplementation;

/**
 * CustomLinkedList
 */
public class CustomLinkedList {


Node head;

// public CustomLinkedList(Node head, Node tail, int data, Node node) {
//     this.head = head;
//     this.tail = tail;
//     this.data = data;
//     this.node = node;
// }

public CustomLinkedList() {

}

public void delete(int index){
    Node n = head; 
    
    if (index ==0){
        head = head.next; 
    } else{
        Node tempNode = null;
        for (int i = 0; i<index-1; i++){
            n = n.next; 
        }
        tempNode = n.next; 
        n.next= tempNode.next; 
        

    }


}



public void addAtStart(int data ){
    Node newNode = new Node(); 
    newNode.data = data;
    newNode.next = head; 
    head = newNode; 
}

public void addAt(int index, int data){
    Node newNode = new Node(); 
    newNode.data = data;

    if (index ==0) {
        addAtStart(data);
    }
    else{
    Node n = head; 
    for(int i = 0; i < index-1; i++){
        n= n.next; 
    } 
    newNode.next =  n.next;
    n.next= newNode;
}


}


public void add(int data){

    Node node = new Node();
    node.data = data; 
    node.next = null;

    if (head == null){
        head = node; 
    } else{
        Node n = head; 
        while(n.next !=null){
            n= n.next;
        }
        n.next = node;

    }
}

public void show(){
    Node node = head; 
    while(node.next!=null){
        System.out.print(node.data+", ");
        node = node.next;
    }
    System.out.print(node.data);
    System.out.println();
}


}