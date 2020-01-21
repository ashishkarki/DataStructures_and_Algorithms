package dataStructures.linkedList;

public class LinkedListStack<T> implements ILinkedListStack<T> {
    ListNode<T> top;
    int size;

    public LinkedListStack() {
        top = null;
    }

    @Override
    public void push(T data) {
        ListNode<T> newNode = new ListNode<T>(data);
        // put this new node on top as the next element i.e. the top-most the element
        // in the list chain, the higher that element/node in the stack
        newNode.setNext(top); // basically insertToFront operation
        size++;
        top = newNode;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }

        T returnData = top.data();
        top = top.next();
        size--;

        return returnData;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }

        return top.data();
    }

    @Override
    public boolean isEmpty() {
        return size == 0; // top == null; // would also work
    }
}
