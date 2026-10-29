import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PrintUtil {
    private PrintUtil() {
    }

    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static <T> void printList(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }

    public static <T extends Printable> void printPrintableList(List<T> list) {
        for (T item : list) {
            System.out.println(item.getPrintDetail());
        }
    }

    public static <T extends Comparable<? super T>> void printListSorted(List<T> list) {
        List<T> sorted = new ArrayList<>(list);
        Collections.sort(sorted);
        printList(sorted);
    }

    public static <T extends Comparable<? super T>> void printListSorted(T[] array) {
        T[] sorted = array.clone();
        java.util.Arrays.sort(sorted);
        printList(sorted);
    }
}
