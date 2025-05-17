import java.util.Scanner;

public class dailySpecialsV2 {
    public static void main(String[] args) {

        String specials;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a week day (Monday - Friday)");

        specials = input.next();

        String coffee = null;

        double price = 0;

        boolean wrongDay = true;


        while (wrongDay){
            System.out.println("Please enter a weekday (not a weekend) or check your spelling");

        specials = input.next();

        switch (specials) {
            case "Monday" -> {
                wrongDay = false;
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            case "Tuesday" -> {
                wrongDay = false;
                coffee = "Cappuccino";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            case "Wednesday" -> {
                wrongDay = false;
                coffee = "Flat White";
                price = 5.45;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            case "Thursday" -> {
                wrongDay = false;
                coffee = "Mocha";
                price = 5.45;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            case "Friday" -> {
                wrongDay = false;
                coffee = "Salted Caramel Latte";
                price = 5.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
        }
    }

        System.out.println("How many " + coffee + "s would you like to order?");

           int order = input.nextInt();
           double totalPrice = price * order;

            if (order == 0) {
                System.out.println("Looks like you don't like " + coffee + "s. So sad!!!");
            } else if (order == 1) {
                System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
            } else {
                System.out.println(order + " " + coffee + "s have been ordered, totalling");
                System.out.printf("$%.2f", totalPrice);
                System.out.println(" dollars.");
            }

     }
 }
// I feel like should admit that my first attempt did not use the nested switch or a while loop. 
// Each of the switch cases contained the "How many?" question and the final chunk of if-else statements. 
// Like so:
//        String specials;
//        Scanner input = new Scanner(System.in);

//        System.out.println("Please enter a week day (Monday - Friday)");
//
//        specials = input.next();
//
//        String coffee;
//        double price;
//        double totalPrice;
//        int order;
//        
//        boolean saturday =specials.equals("Saturday");
//        boolean sunday =specials.equals("Sunday");
//
//        if(saturday || sunday){
//            System.out.println("Please enter a weekday, not a weekend.");
//            specials = input.next();
//        }
//        switch (specials) {
//            case "Monday" -> {
//                coffee = "Latte";
//                price = 4.95;
//                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
//                System.out.println("How many " + coffee + "s would you like to order?");
//                order = input.nextInt();
//                totalPrice = price * order;
//
//                if (order == 0) {
//                    System.out.println("Looks like you don't like " + coffee + "s. So sad!!!");
//                } else if (order == 1) {
//                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
//                } else {
//                    System.out.println(order + " " + coffee + "s have been ordered, totalling");
//                    System.out.printf("$%.2f", totalPrice);
//                    System.out.println(" dollars.");
//                }
//            }
//         case "Tuesday" -> {
//         ... etc.


