package company;

public class TartCompany {

    public static void main(String[] args) {
        Cake cake1 = new Cake("cake");
        CakeBox cakeBox = new CakeBox();

        Box cakesBox = new Box (cakeBox.put(cake1));

        /*System.out.println(cake.get());
        System.out.println(cake.put("Meadow Cake"));*/

        //Box cake2 = new Box("Шоколодный кекс");

        System.out.println(cakesBox.get());



    }
}
