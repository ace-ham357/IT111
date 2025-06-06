package package_person_homework;

import java.time.LocalDate;

public class Person {
    String name;
    int age;
    int car;
    boolean violations;
    double creditScore;
    int currentYear = LocalDate.now().getYear();


    public void display(){
        System.out.println("Your name: " +name);
        System.out.println("Your age: " +age);
        System.out.println("Your car (year): " +car);
        System.out.println("Your violations: " +violations);
        System.out.println("Your Credit Score: " +creditScore);
    }

    public double getRate(double monthlyRate){
        if(violations == true && creditScore <= 700){
            monthlyRate = 500.00;
        } else {
            monthlyRate = 100.00;
        }
        return monthlyRate;
    }
    public double assumeAge(double adjustedRate) {
        if (age <= 25) {
            adjustedRate = 100.00;
        } else {
            adjustedRate = 0;
        }
        return adjustedRate;
    }
    public double carAge(double carAdjustedRate){
        if (currentYear-car <= 5){
            carAdjustedRate = 100.00;
        }else {
            carAdjustedRate = 0;
        }
        return carAdjustedRate;
    }
}


