package example1;

// мы предполагаем, что тип Т это "какой-то тип"
public class GenericType<T> {
    // поле какого-то типа
    private T t;

    // конструктор класса берет переменную какого-то типа
    // и присваивает его полю класса
    public GenericType(T t) {
        this.t = t;
    }
    // возвращает значение какого-то типа
    public T get() {
        return t;
    }

    // берет значение какого-то типа присваивает его полю и потом возвращает его
    public T set(T t) {
        this.t = t;
        return this.t;
    }


}
