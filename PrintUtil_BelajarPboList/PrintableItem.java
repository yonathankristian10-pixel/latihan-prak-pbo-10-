public class PrintableItem implements Printable {
    private final String name;
    private final int value;

    public PrintableItem(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getPrintDetail() {
        return name + " - " + value;
    }

    @Override
    public String toString() {
        return getPrintDetail();
    }
}
