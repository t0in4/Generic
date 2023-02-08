package example3Array;

public class ImmutableArray<T> {
    private final T[] items;

    public ImmutableArray(T[] items) {

        this.items = items.clone();
    }


    // getter для получения по индексу элемента
    public T get(int index) {
        return items[index];
    }

    public int lenght() {
        return items.length;
    }
}
