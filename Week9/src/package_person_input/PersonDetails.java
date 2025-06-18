package package_person_input;

import java.util.Scanner;

public class PersonDetails {
    public static void main(String[] args){
        //create object - customer

        Person customer;
        customer = new Person();

        int states = 0;
        double surcharge = 0;
        double monthlyRate = 0;
        double adjustedRate = 0;

        System.out.println("Please enter your name.");
        Scanner input = new Scanner(System.in);
        customer.name = input.next();

        System.out.println("Please enter your age.");
        customer.age = input.nextInt();

        System.out.println("Please enter your gender (use 'F', 'M', or 'N').");
        customer.gender = input.next().charAt(0);

        System.out.println("Please enter your 5 digit ZIP code.");
        customer.zipCode = input.next();

        System.out.println("Do you have any traffic violations? (Please enter 'true' for 'yes' or 'false' for 'no')");
        customer.violations = input.nextBoolean();

        if (customer.violations == true){
            System.out.println("Do you have any DUIs? (Please enter 'true' for 'yes' or 'false' for 'no')");
            customer.violationDUI = input.nextBoolean();
            System.out.println("Do you have any Red Light violations? (Please enter 'true' for 'yes' or 'false' for 'no')");
            customer.violationRedLight = input.nextBoolean();
            System.out.println("Do you have any speeding tickets? (Please enter 'true' for 'yes' or 'false' for 'no')");
            customer.violationSpeeding = input.nextBoolean();

        }
        System.out.println("Please enter your credit score.");
        customer.creditScore = input.nextInt();
        System.out.println();

        customer.display();

        System.out.println(customer.identifyRegion(states));
        System.out.println("Your California surcharge is: " +customer.caliRegion(surcharge));
        System.out.println("Violations or credit score adjustments: " +customer.getRate(monthlyRate));
        System.out.println("Age category adjustment: " +customer.ageCategory(adjustedRate));
        System.out.print("Your new monthly premium is ");
        System.out.println(customer.baselineRate + customer.ageCategory(adjustedRate) + customer.caliRegion(surcharge) + customer.getRate(monthlyRate));


    }
}
