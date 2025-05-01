public class MyOperators2 {

    public static void main(String[] args){

//        boolean tuna = true;
//        boolean bread = true;
//        if(tuna == true && bread == true) {
//            System.out.println("We are having a sandwich!");
//        } else {
//            System.out.println("We are not!");
//        }

        boolean tuna = false;
        boolean bread = true;
        if(tuna == true || bread == true) {
            System.out.println("We are having some food products");

        } else {
            System.out.println("We will not be having food products today");
        }

        // age - drinking age

        int age = 21;
        if(age >= 21){
            System.out.println("Yippy skippy, we can order some booze!");
        }else {
            System.out.println("We will have a diet Coke");
        }

        // Roller coaster

        int height = 4;
        if(height < 4){
            System.out.println("You will not be able to ride the roller coaster");
        }else {
            System.out.println("Have a great time on the roller coaster!");
        }

    }
}
