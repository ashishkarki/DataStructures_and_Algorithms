package dataStructures.linkedList;

public interface ILinkedListStack<T> {

    public void push(T data);

    public T pop();

    public T peek();

    public boolean isEmpty();
}
