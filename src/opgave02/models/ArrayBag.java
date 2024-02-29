package opgave02.models;

import java.util.Arrays;

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
        if (!isFull()) {
            items[size] = newEntry;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public E remove() {
        if (!isEmpty()) {
            E temp = items[size - 1];
            items[size - 1] = null;
            size--;
            return temp;
        }
        return null;
    }

    @Override
    public boolean remove(E anEntry) {
        if (!isEmpty()) {
            int temp = -1;
            for (int i = 0; i < size; i++) {
                if (items[i] == anEntry) {
                    items[i] = null;
                    temp = i;
                }
            }
            if (temp != -1) {
                for (int i = temp; i < size; i++) {
                    items[i] = items[i + 1];
                }
                items[size] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        Arrays.fill(items, null);
        size = 0;
    }

    @Override
    public int getFrequencyOf(E anEntry) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].equals(anEntry)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean contains(E anEntry) {
        for (E item : items) {
            if (item == anEntry) {
                return true;
            }
        }
        return false;
    }

    @Override
    public E[] toArray() {
        E[] newArray = (E[]) new Object[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = items[i];
        }
        return newArray;
    }
}