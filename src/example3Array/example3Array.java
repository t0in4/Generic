package example3Array;

public class example3Array {

    public static void main(String[] args) {
        var stringArray = new ImmutableArray<>(new String[] {
                "item1", "item2", "item3", "item4"
        });

        for (int i = 0; i < stringArray.lenght(); i++) {
            System.out.print(stringArray.get(i) + " ");
        }
        System.out.println();

        String[] nonGenericArray = {"1", "2", "3", "4"};
        for (int i = 0; i < nonGenericArray.length; i++) {
            System.out.print(nonGenericArray[i] + " ");
        }
        var stringArray2 = new ImmutableArray<>(new Integer[] {
                5, 6, 7, 8
        });


    }
}
