import java.util.Scanner;

public class MyConstants {
    public static void main(String[] args){

        final int TOUCHDOWN = 6;
        final int CONVERSION = 1;
        final int FIELDGOAL = 3;

        int td, con, fg;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of touchdowns.");
        td = input.nextInt() * TOUCHDOWN;
        System.out.println("Please enter the number of conversions.");
        con = input.nextInt() * CONVERSION;
        System.out.println("Please enter the number of field goals.");
        fg = input.nextInt() * FIELDGOAL;

        System.out.println("Points from touchdowns " +td);
        System.out.println("Points from conversions " +con);
        System.out.println("Points from field goals " +fg);
        System.out.print("The total score is ");
        System.out.println(td + con + fg);
    }
}
