public class LitersToGallons {

    public static void main(String[] args){
            // lit = (gal * 3.78541)

            int counter = 0;
            double gal, lit;
            for(gal = 1; gal <= 100; gal = gal+4) {
                lit = (gal * 3.78541);
                counter ++;
                if (gal == 1) {
                    System.out.printf("%.2f", lit);
                    System.out.println(" Liters = " + gal + " Gallon");

                } else if ((counter % 5) == 0) {
                    System.out.printf("%.2f", lit);
                    System.out.println(" Liters = " + gal + " Gallons");
                    System.out.println();

                } else {
                    System.out.printf("%.2f", lit);
                    System.out.println(" Liters = " + gal + " Gallons");
                }

            }

            System.out.println("We are done!!!!");

    }

}
