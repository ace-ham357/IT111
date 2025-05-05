import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        //ask user to input numerical grades

        int counter = 1;
        int grade;
        double total = 0;
        double average;

        Scanner input = new Scanner(System.in);

        while (counter <= 5) {

            if (counter == 1) {
                System.out.println("Please enter your " + counter + "st numerical grade.");
            } else if (counter == 2) {
                System.out.println("Please enter your " + counter + "nd numerical grade.");
            } else if (counter == 3) {
                System.out.println("Please enter your " + counter + "rd numerical grade.");
            } else {
                System.out.println("Please enter your " + counter + "th numerical grade.");
            }

            grade = input.nextInt();
            total += grade;
            counter += 1;
        }
        String message;
        char letterGrade;
        counter -= 1;
        average = total / counter;

        System.out.println("You have earned an average grade of " +average+ " after providing us with " +counter+ " grades.");

        // Recording mistake: ... average < 100) - does not include 100, therefore 100 would be included in "else"
        // Correction: ... average <= 100)
        
        if (average >= 90 && average <= 100) {
            letterGrade = 'A';
            message = "Excellent work!";
        } else if (average >= 80 && average < 90) {
            letterGrade = 'B';
            message = "Solid work!";
        } else if (average >= 70 && average < 80) {
            letterGrade = 'C';
            message = "More studying necessary.";
        } else if (average >= 60 && average < 70) {
            letterGrade = 'D';
            message = "It'll get a degree...";
        } else {
            letterGrade = 'F';
            message = "Not a passing grade";
        }
        System.out.println("You have earned the following grade: " +letterGrade+ ", and here is the message: " +message);

    }
}
