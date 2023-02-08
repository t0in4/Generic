package example2;

class Three<T, U, V> {
    T t;
    U u;
    V v;

    public Three(T t, U u, V v) {
        this.t = t;
        this.u = u;
        this.v = v;
    }

    // соглашение по именованию типов параметров генериков
    // T - тип
    // S, U, V и т.д. - 1, 2, 3, 4 типы данных
    // E - элемент (используется в коллекциях (массивы и т.д.)))
    // K - key ключ (в словарях и т.д.)
    // V - value значение (в словарях и т.д.)
    // K : V пара ключ - значение
    // N - number число


}
