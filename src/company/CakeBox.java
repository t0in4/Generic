package company;

class CakeBox {

    Cake cake;

    public Cake put(Cake cake) {
        this.cake = cake;
        return cake;
    }

    public Cake get() {
        return this.cake;
    }

    @Override
    public String toString() {
        return "CakeBox{" +
                "cake=" + cake +
                '}';
    }
}