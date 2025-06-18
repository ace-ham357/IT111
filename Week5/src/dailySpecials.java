import java.util.Scanner;

public class dailySpecials {
    public static void main(String[] args){

        String specials;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a week day (Monday - Friday)");

        specials = input.next();


        String coffee;
        double price;
        double totalPrice;
        int order;

        boolean saturday =specials.equals("Saturday");
        boolean sunday =specials.equals("Sunday");

        if(saturday || sunday){
            System.out.println("Please enter a weekday, not a weekend.");
            specials = input.next();
        }


        switch (specials) {
            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;

                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many " + coffee + "s would you like to order?");

                order = input.nextInt();
                totalPrice = price * order;

                if (order == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s. So sad!!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering 1 " + coffee + " today!");
                    System.out.print("That will be ");
                    System.out.printf("$%.2f", totalPrice);
                    System.out.println(" dollars.");
                } else {
                    System.out.println(order + " " + coffee + "s have been ordered, totalling");
                    System.out.printf("$%.2f", totalPrice);
                    System.out.println(" dollars.");
                }
            }
            case "Tuesday" -> {
                coffee = "Cappuccino";
                price = 4.95;

                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many " + coffee + "s would you like to order?");

                order = input.nextInt();
                totalPrice = price * order;

                if (order == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s. So sad!!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering 1 " + coffee + " today!");
                    System.out.print("That will be ");
                    System.out.printf("$%.2f", totalPrice);
                    System.out.println(" dollars.");
                } else {
                    System.out.println(order + " " + coffee + "s have been ordered, totalling");
                    System.out.printf("$%.2f", totalPrice);
                }
            }
            case "Wednesday" -> {
                coffee = "Flat White";
                price = 5.45;

                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many " + coffee + "s would you like to order?");

                order = input.nextInt();
                totalPrice = price * order;

                if (order == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s. So sad!!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering 1 " + coffee + " today!");
                    System.out.print("That will be ");
                    System.out.printf("$%.2f", totalPrice);
                    System.out.println(" dollars.");
                } else {
                    System.out.println(order + " " + coffee + "s have been ordered, totalling");
                    System.out.printf("$%.2f", totalPrice);
                    System.out.println(" dollars.");
                }
            }
            case "Thursday" -> {
                coffee = "Mocha";
                price = 5.45;

                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many " + coffee + "s would you like to order?");

                order = input.nextInt();
                totalPrice = price * order;

                if (order == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s. So sad!!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering 1 " + coffee + " today!");
                    System.out.print("That will be ");
                    System.out.printf("$%.2f", totalPrice);
                    System.out.println(" dollars.");
                } else {
                    System.out.println(order + " " + coffee + "s have been ordered, totalling");
                    System.out.printf("$%.2f", totalPrice);
                    System.out.println(" dollars.");
                }
            }
            case "Friday" -> {
                coffee = "Salted Caramel Latte";
                price = 5.95;

                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many " + coffee + "s would you like to order?");

                order = input.nextInt();
                totalPrice = price * order;

                if (order == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s. So sad!!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering 1 " + coffee + " today!");
                    System.out.print("That will be ");
                    System.out.printf("$%.2f", totalPrice);
                    System.out.println(" dollars.");
                } else {
                    System.out.println(order + " " + coffee + "s have been ordered, totalling");
                    System.out.printf("$%.2f", totalPrice);
                    System.out.println(" dollars.");
                }
            }
        }

    }
}
