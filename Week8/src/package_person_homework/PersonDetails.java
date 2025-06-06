package package_person_homework;

public class PersonDetails {
    public static void main(String[] args){

        package_person_homework.Person firstPerson;
        package_person_homework.Person secondPerson;

        firstPerson = new package_person_homework.Person();
        secondPerson = new Person();

        firstPerson.name = "Cathy Jones";
        firstPerson.age = 33;
        firstPerson.car = 2010;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall Black";
        secondPerson.age = 22;
        secondPerson.car = 2021;
        secondPerson.violations = true;
        secondPerson.creditScore = 710;

        double monthlyRate = 0;
        double adjustedRate = 0;
        double carAdjustedRate = 0;

        firstPerson.display();
        System.out.println("Preliminary Rate: $" +firstPerson.getRate(monthlyRate));
        System.out.print("Adjustments: $");
        System.out.println(firstPerson.assumeAge(adjustedRate)+firstPerson.carAge(carAdjustedRate));
        System.out.print("Total monthly premium: $");
        System.out.println(firstPerson.assumeAge(adjustedRate)+firstPerson.getRate(monthlyRate)+ firstPerson.carAge(carAdjustedRate));

        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate: $" +secondPerson.getRate(monthlyRate));
        System.out.print("Adjustments: $");
        System.out.println(secondPerson.assumeAge(adjustedRate)+secondPerson.carAge(carAdjustedRate));
        System.out.print("Total monthly premium: $");
        System.out.println(secondPerson.assumeAge(adjustedRate)+secondPerson.getRate(monthlyRate)+secondPerson.carAge(carAdjustedRate));
        System.out.println();
    }
}
