import java.util.Arrays;

public class MyArrays {

    public static void main(String[] args){

        String[] cars = new String[4];

        cars[0] = "Volvo";
        cars[1] = "Ford";
        cars[2] = "Toyota";
        cars[3] = "Honda";

        System.out.println(cars[0].toUpperCase());
        System.out.println(Arrays.toString(cars));

        String[] books = {"Lord of the Rings", "Pathfinder", "Iron Widow", "The Hitchhikers Guide to the Galaxy", "Artemis Fowl"};
        System.out.println(Arrays.toString(books));

        for(String book: books) {
            System.out.println(book);
        }

        int[] numbers = new int[3];
        numbers[0] = 20;
        numbers[1] = 30;
        numbers[2] = 50;

        System.out.println(Arrays.toString(numbers));

        for(int number: numbers){
            System.out.println(number);
        }

        String[] wines = new String[5];
        wines[0] = "Cabernet";
        wines[1] = "Merlot";
        wines[2] = "Syrah";
        wines[3] = "Malbec";
        wines[4] = "Cabernet-Frank";

        for(String wine: wines){
            System.out.println(wine);
            System.out.println(wine.length());
        }

        for(String wine: wines){
            if(wine.equals("Syrah")){
                break;
            }
            System.out.println(wine);
        }

    }
}
