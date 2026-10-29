import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);

        System.out.println("List:");
        PrintUtil.printList(numbers);

        System.out.println("Sorted list:");
        PrintUtil.printListSorted(numbers);

        System.out.println("Original list:");
        PrintUtil.printList(numbers);

        Integer[] array = {5, 3, 8, 1};
        System.out.println("Array:");
        PrintUtil.printList(array);

        System.out.println("Sorted array:");
        PrintUtil.printListSorted(array);

        BelajarPboList<Box<Integer>> myList = new BelajarPboList<>();
        myList.add(new Box<>(123));
        myList.add(new Box<>(45));
        myList.add(new Box<>(7));

        System.out.println("BelajarPboList:");
        myList.printList();

        System.out.println("BelajarPboList sorted:");
        myList.printListSorted();

        System.out.println("BelajarPboList original:");
        myList.printList();

        List<PrintableItem> printableItems = new ArrayList<>();
        printableItems.add(new PrintableItem("Item A", 10));
        printableItems.add(new PrintableItem("Item B", 20));

        System.out.println("Printable list:");
        PrintUtil.printPrintableList(printableItems);
    }
}
