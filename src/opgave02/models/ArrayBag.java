package opgave02.models;

public class ArrayBag<E> implements Bag<E> {
    // the array to hold the items
    private final E[] items;
    // current number of items in the bag,
    // items are at index 0..size-1
    private int size;

    /** Create a bag with the given capacity. */
    public ArrayBag(int capacity) {
        @SuppressWarnings("unchecked")
        E[] empty = (E[]) new Object[capacity];
        items = empty;
        size = 0;
    }

    /** Create a bag with capacity 10. */
    public ArrayBag() {
        this(10);
    }

    @Override
    public int getCurrentSize() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size == items.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(E newEntry) {
        // TODO
        return false;
    }

    @Override
    public E remove() {
        // TODO
        return null;
    }

    @Override
    public boolean remove(E anEntry) {
        // TODO
        return false;
    }

    @Override
    public void clear() {
        // TODO
    }

    @Override
    public int getFrequencyOf(E anEntry) {
        // TODO
        return 0;
    }

    @Override
    public boolean contains(E anEntry) {
        // TODO
        return false;
    }

    @Override
    public E[] toArray() {
        // TODO
        return null;
    }
}