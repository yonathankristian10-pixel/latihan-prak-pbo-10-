import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BelajarPboList<T extends Comparable<? super T>> extends AbstractList<T> {
    private final List<T> data = new ArrayList<>();

    @Override
    public T get(int index) {
        return data.get(index);
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public void add(int index, T element) {
        data.add(index, element);
    }

    @Override
    public T set(int index, T element) {
        return data.set(index, element);
    }

    @Override
    public T remove(int index) {
        return data.remove(index);
    }

    public void printList() {
        PrintUtil.printList(data);
    }

    public void printListSorted() {
        List<T> sorted = new ArrayList<>(data);
        Collections.sort(sorted);
        PrintUtil.printList(sorted);
    }
}
