import java.util.Scanner;

public class dailySpecialsFinal {
    public static void main(String[] args) {

        String specials;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a week day (Monday - Friday)");

        specials = input.next();

        String coffee;

        double price;

        boolean weekdays = specials.equals("Monday") || specials.equals("Tuesday") || specials.equals("Wednesday") || specials.equals("Thursday") || specials.equals("Friday");

        while (!weekdays) {

            if (specials.equals("Saturday") || specials.equals("Sunday")) {
                System.out.println("Please enter a weekday, not a weekend");
                specials = input.next();
            } else if (specials.equals("Monday") || specials.equals("Tuesday") || specials.equals("Wednesday") || specials.equals("Thursday") || specials.equals("Friday")) {
                weekdays = true;
            } else {
                System.out.println("Please enter a weekday or check your spelling/capitalization");
                specials = input.next();
            }
        }


        switch (specials) {
            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
            }
            case "Tuesday" -> {
                coffee = "Cappuccino";
                price = 4.95;
            }
            case "Wednesday" -> {
                coffee = "Flat White";
                price = 5.45;
            }
            case "Thursday" -> {
                coffee = "Mocha";
                price = 5.45;
            }
            case "Friday" -> {
                coffee = "Salted Caramel Latte";
                price = 5.95;
            }
            default -> {
                System.out.println("Please enter a valid day or check your spelling and exit, and try again!");
                input.close();
                return;
            }
        }

        System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
        System.out.println("How many " + coffee + "s would you like to order?");

                int order = input.nextInt();
                double totalPrice = price * order;

                if (order == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s. So sad!!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
                } else if (order >= 2 && order < 5) {
                    System.out.print(order + " " + coffee + "s have been ordered, totalling ");
                    System.out.printf("$%.2f", totalPrice);
                    System.out.println(".");
                } else if (order >= 5 && order < 10) {
                    totalPrice = totalPrice * .9;
                    System.out.println(order + " " + coffee + "s have been ordered, which makes you eligible for a 10% group discount!");
                    System.out.print("Your total with the discount is ");
                    System.out.printf("$%.2f", totalPrice);
                    System.out.println(".");
                } else if (order >= 10) {
                    totalPrice = totalPrice * .8;
                    System.out.println(order + " " + coffee + "s have been ordered, which makes you eligible for a 20% group discount!");
                    System.out.print("Your total with the discount is ");
                    System.out.printf("$%.2f", totalPrice);
                    System.out.println(".");
                }

        }
    }





