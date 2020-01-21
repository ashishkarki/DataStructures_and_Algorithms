package dataStructure.linkedList;

public class LinkedList {

    private int length;
    LinkedListNode head; // intentionally a public field

    // default constructor
    public LinkedList() {
        length = 0;
    }

    // OPERATIONS FOLLOW::::

    // 1. return first node in the list
    public synchronized LinkedListNode getHead() {
        return head;
    }

    // 2.1 insert at the START of the list: O(1) operation
    public synchronized void insertAtBeginning(LinkedListNode node) {
        node.setNext(node);
        head = node;
        length++;
    }
}
