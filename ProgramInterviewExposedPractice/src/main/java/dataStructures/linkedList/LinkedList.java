package dataStructures.linkedList;

public class LinkedList<T> {
    ListNode<T> head;
    int size = 0;

    public LinkedList() {
        head = null;
    }

    public LinkedList(T initData) {
        head = new ListNode<T>(initData);
        size++;
    }

    // Complexity: Time =
    public void insertInFront(T newHeadData) {
        head = insertInFront(this.head, newHeadData);
    }

    private ListNode<T> insertInFront(ListNode<T> listNode, T newHeadData) {
        ListNode<T> newNode = new ListNode<T>(newHeadData);
        newNode.setNext(listNode);
        size++;

        return newNode;
    }

    // complexity
    public ListNode<T> findNode(T findData) {
        return findNode(this.head, findData);
    }

    private ListNode<T> findNode(ListNode<T> head, T findData) {
        ListNode<T> cursor = head;

        while (cursor.next() != null && cursor.data() != findData) {
            cursor = cursor.next();
        }

        return cursor;
    }

    // complexity:
    public boolean deleteNode(T deleteData) {
        if (head == null) return false;

        // if node to be delete is head, modify head
        if (head.data() == deleteData) {
            head = head.next();
            size--;

            return true;
        }

        // otherwise, for nodes in between somewhere:
        ListNode<T> cursor = head;
        while (cursor != null && cursor.next() != null) {
            if (cursor.next().data() == deleteData) {
                cursor.setNext(cursor.next().next());
                size--;

                return true;
            }

            cursor = cursor.next();
        }

        // if the node wasn't found, return false
        return false;
    }
}
