package package_person;

public class PersonDetails {
    public static void main(String[] args){

        Person firstPerson;
        Person secondPerson;

        firstPerson = new Person();
        secondPerson = new Person();

        firstPerson.name = "Cathy";
        firstPerson.age = 33;
        firstPerson.gender = 'F';
        firstPerson.car = "Volkswagon Bug";
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendal";
        secondPerson.age = 22;
        secondPerson.gender = 'M';
        secondPerson.car = "Mustang";
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        double monthlyRate = 0;
        double adjustedRate = 0;

        firstPerson.display();
        System.out.println("Preliminary Rate for " + firstPerson.name+ ": $" +firstPerson.getRate(monthlyRate));
        System.out.println("Adjustments: $" +firstPerson.assumeGender(adjustedRate));
        System.out.print("Here is " + firstPerson.name+ "'s total monthly premium: $");
        System.out.println(firstPerson.assumeGender(adjustedRate)+firstPerson.getRate(monthlyRate));

        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate for " + secondPerson.name+ ": $" +secondPerson.getRate(monthlyRate));
        System.out.println("Adjustments: $" +secondPerson.assumeGender(adjustedRate));
        System.out.print("Here is " + secondPerson.name+ "'s total monthly premium: $");
        System.out.println(secondPerson.assumeGender(adjustedRate)+secondPerson.getRate(monthlyRate));
        System.out.println();
    }
}
