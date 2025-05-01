public class MyOperators {

    public static void main(String[] args){

//        int regHours, overtimeHours;
//        double overtimePay, regularPay, total;
//        float wage;
//        double hourlyWithOT;
//
//        regHours = 40;
//        overtimeHours = 5;
//        wage = 25.50F;
//        regularPay = regHours * wage;
//        overtimePay = (wage * 1.5) * overtimeHours;
//        total = overtimePay + regularPay;
//        hourlyWithOT = total/(regHours + overtimeHours);
//
//
//        System.out.println("Regular pay: $" +regularPay+ " dollars");
//        System.out.println("Overtime pay: $" +overtimePay+ " dollars");
//        System.out.println("Total pay: $" +total+ " dollars");
//        System.out.println("Hourly rate with overtime: $" +hourlyWithOT+ " dollars");
//        System.out.print("Hourly rate with overtime: ");
//        System.out.printf("$%.2f", hourlyWithOT);
//        System.out.println(" dollars");



//         modulus operator

        int number1, number2, number3;

        number1 = 487;
        number2 = 2;
        number3 = number1 % number2;


        if(number3 == 0) {

            System.out.println(number1+ " is an even number");
    }   else {

            System.out.println(number1+ " is an odd number");
        }

/*
       Shopping
        double tax, itemPrice, itemTax, totalPrice;

        tax = .10;
        itemPrice = 100.00;
        itemTax = itemPrice * tax;
        totalPrice = itemPrice + itemTax;

        System.out.println("Price of item $" +itemPrice+ " dollars");
        System.out.println("Tax $" +itemTax+ " dollars");
        System.out.println("Price with tax $" +totalPrice+ " dollars");
*/

        double itemPrice = 100;
        itemPrice *= 1.10;

        System.out.println("Total price of item is $" +itemPrice+ " dollars");
        System.out.print("Total price of item is ");
        System.out.printf("$%.2f", itemPrice);



    }
}
