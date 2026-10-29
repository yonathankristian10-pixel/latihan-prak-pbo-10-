import java.util.Objects;

public class Box<T extends Comparable<? super T>> implements Comparable<Box<T>> {
    private final T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public int compareTo(Box<T> other) {
        return value.compareTo(other.value);
    }

    @Override
    public String toString() {
        return "Box{" + value + "}";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Box<?>)) {
            return false;
        }
        Box<?> other = (Box<?>) object;
        return Objects.equals(value, other.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
