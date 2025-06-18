import java.util.Scanner;

public class MyEnum {
    enum WhoWins{HOME, VISITOR, NEITHER}

    public static void main(String[] args){

        WhoWins who;
        int seahawks, broncos;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the final score for the Seahawks");
        seahawks = input.nextInt();

        System.out.println("Please enter the final score for the Broncos");
        broncos = input.nextInt();

        if(seahawks > broncos){
            who = WhoWins.HOME;
            System.out.println(who+ " team wins!");
            System.out.print("Seahawks won by ");
            System.out.println(seahawks - broncos+ " points!");
        } else if (broncos > seahawks) {
            who = WhoWins.VISITOR;
            System.out.println(who+ " team wins.");
            System.out.print("Broncos won by ");
            System.out.println(broncos - seahawks+ " points.");
        } else {
            who = WhoWins.NEITHER;
            System.out.println(who+ " team wins.");
        }
    }
}
