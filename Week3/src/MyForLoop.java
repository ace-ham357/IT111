public class MyForLoop {
    public static void main(String[] args){

      int count;
        for(count = 0; count <= 20; count = count+2) {
            System.out.println(count);
        }
        System.out.println("All done!");

        int newCount;
        for(newCount = 30; newCount > 0; newCount = newCount-2){

            if(newCount == 10){
                System.out.println("we are almost to Blast Off! Only " +newCount+ " seconds away");
            } else if (newCount < 10) {
                System.out.println("Only " +newCount+ " seconds away");

            } else {
                System.out.println(newCount);
            }
        }
        System.out.println("Blast Off!");
    }
}
