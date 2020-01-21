package dataStructure.linkedList;

public class LinkedListNode {
    private int data;
    private LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
    }

    /**
     * Time Complexity: O(n), for scanning the list of size n.
     * Space Complexity: O(1), for creating a temporary variable.
     */
    public int getListLength(LinkedListNode head) {
        int length = 0;
        var currentNode = head;

        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }

        return length;
    }

    // all getters and setters after this.
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
}
