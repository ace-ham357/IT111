public class MyATM {
    public static void main(String[] args){
        int withdrawal, amount;
        withdrawal = 25;
        amount = 200;

        while (amount != 0){
            amount -= withdrawal;
//            System.out.println("Your present amount after the withdrawal is " +amount+ " dollars");
            if(amount == 0){
                System.out.println("You have no money, honey.");
            } else {
                System.out.println("Your present amount after the withdrawal is " +amount+ " dollars");
            }
        }

    }
}
