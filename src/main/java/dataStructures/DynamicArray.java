package dataStructures;

public class DynamicArray<T> {

    private Object[] data;
    private int size = 0;
    private int initialCapacity;

    public DynamicArray(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        data = new Object[this.initialCapacity];
    }

    // O(1) operation
    public T get(int index) {
        return (T) data[index];
    }

    // O(1) operation
    public void set(int index, String value) {
        data[index] = value;
    }

    // O(n) operation : at max we move n elements
    public void insert(int index, String value) {
        if (size == initialCapacity) {
            resize();
        }

        // copy up the elements
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }

        // insert value at specified location
        data[index] = value;
        size++;
    }

    public void delete(int index) {
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(T value) {
        return false;
    }

    public int getSize() {
        return size;
    }

    public void add(T value) {
        if (size == initialCapacity) {
            resize();
        }

        data[size] = value;
        size++;
    }

    public void resize() {
        // first declare a new array with twice the capacity
        Object[] newData = new Object[initialCapacity * 2];

        // next copy over exiting data from old to new array
        for (int i = 0; i < initialCapacity; i++) {
            newData[i] = data[i];
        }

        // make newData the new data
        data = newData;

        // also, double the initialCapacity
        initialCapacity *= 2;
    }
}
