package opgave03.models;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class ArrayListRing<T> implements Ring<T> {
    ArrayList<T> arrayList = new ArrayList<>();
    T currentItem;

    public ArrayListRing() {
        currentItem = null;
    }

    @Override
    public void advance() {
        if (arrayList.size() > 1) {
            if (arrayList.indexOf(currentItem) != arrayList.size() - 1) {
                currentItem = arrayList.get(arrayList.indexOf(currentItem) + 1);
            } else {
                currentItem = arrayList.getFirst();
            }
        }
    }

    @Override
    public T getCurrentItem() {
        return currentItem;
    }

    @Override
    public void add(T item) {
        arrayList.add(item);
        currentItem = item;
    }

    @Override
    public boolean removeItem(T item) {
        if (!arrayList.isEmpty()) {
            int index = -1;
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).equals(item)) {
                    index = i;
                }
            }
            if (index != -1) {
                if (item.equals(currentItem) && arrayList.get(index + 1) != null) {
                    currentItem = arrayList.get(index + 1);

                } else if (arrayList.size() - 1 == 0) {
                    currentItem = null;
                } else {
                    currentItem = arrayList.get(0);
                }
                arrayList.remove(index);
            }
        }
        return false;
    }

    @Override
    public T removeCurrentItem() {
        if (!arrayList.isEmpty()) {
            T temp = currentItem;
            if (arrayList.indexOf(currentItem) != arrayList.size() - 1) {
                currentItem = arrayList.get(arrayList.indexOf(currentItem) + 1);
            } else if (arrayList.size() - 1 == 0) {
                currentItem = null;
            } else {
                currentItem = arrayList.getFirst();
            }
            arrayList.remove(temp);
            return temp;
        } else {
            throw new RuntimeException("EmptyRingException");
        }
    }

    @Override
    public int size() {
        return arrayList.size();
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    public void map(Function<T, T> function) {
        int currentItemIndex = arrayList.indexOf(getCurrentItem());
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, function.apply(arrayList.get(i)));
        }
        currentItem = arrayList.get(currentItemIndex);
    }

    public ArrayListRing<T> where(Predicate<T> predicate) {
        ArrayListRing<T> ring = new ArrayListRing<>();
        for (T t : arrayList) {
            if (predicate.test(t)) {
                ring.add(t);
            }
        }
        return ring;
    }
}
