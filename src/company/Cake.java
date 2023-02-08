package company;

public class Cake {
    String name;
    public Cake(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "name='" + name + '\'' +
                '}';
    }
}
