package dataStructures.linkedList;

public class ListNode<T> {

    private T data;
    private ListNode<T> next;

    public ListNode(T data) {
        this.data = data;
    }

    // setters and getters
    public T data() {
        return data;
    }

    public ListNode<T> next() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }
}
