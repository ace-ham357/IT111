import java.util.Scanner;

public class MyInput {
    public static void main(String[] args){
        String name, message;
        int age;
        double salary;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter your first name!");
        name = myObj.next();

        System.out.println(name+ ", please enter your age!");
        age = myObj.nextInt();

        System.out.println(name+ ", last, but not least, please enter your salary!");
        salary = myObj.nextDouble();

        if(salary < 50_000){
            message = "I need another job, or a roommate";
        } else if (salary >= 50_000 && salary < 60_000) {
            message = "Not bad, but hard to survive in Seattle";
        } else if (salary >= 60_000 && salary < 70_000) {
            message = "Salary is getting better";
        } else if (salary >= 70_000 && salary < 80_000) {
            message = "Almost liveable  in Seattle";
        } else {
            message = "Life is Good!";
        }

        System.out.println("First name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Salary: $" +salary);
        System.out.println(message);
    }
}
