public class PersonRegular {
    public static void main(String[] args){

        String firstPersonName = "Cathy";
        String secondPersonName = "Kendall";
        char firstPersonGender = 'F';
        char secondPersonGender = 'M';
        int firstPersonAge = 33;
        int secondPersonAge = 22;
        String firstPersonCar = "Volkswagon Bug";
        String secondPersonCar = "Mustang";
        boolean firstPersonViolations = false;
        boolean secondPersonViolations = true;
        int firstPersonCredit = 690;
        int secondPersonCredit = 670;

        double monthlyRate1;
        double monthlyRate2;

        double adjustedRate1;
        double adjustedRate2;

        if(firstPersonViolations == true && firstPersonCredit <= 700){
            monthlyRate1 = 500;
        } else {
            monthlyRate1 = 100;
        }

            if(secondPersonViolations == true && secondPersonCredit <= 700){
                monthlyRate2 = 500;
            } else {
                monthlyRate2 = 100;
            }


        if(firstPersonAge <= 25 && firstPersonGender == 'F'){
            adjustedRate1 = 100;
        } else {
            adjustedRate1 = 0;
        }

            if(secondPersonAge <= 25 && secondPersonGender == 'M'){
                adjustedRate2 = 100;
            } else {
                adjustedRate2 = 0;
            }

        double total1 = monthlyRate1 + adjustedRate1;
        double total2 = monthlyRate2 + adjustedRate2;

        System.out.println("First Person Name: " +firstPersonName);
        System.out.println("First Person Gender: " +firstPersonGender);
        System.out.println("First Person Age: " +firstPersonAge);
        System.out.println("First Person Car: " +firstPersonCar);
        System.out.println("First Person Violations: " +firstPersonViolations);
        System.out.println("First Person Credit: " +firstPersonCredit);
        System.out.println("First Person Preliminary Rate: " +monthlyRate1);
        System.out.println("First Person Final Rate (adjusted for age and gender): " +total1);
        System.out.println();


        System.out.println("Second Person Name: " +secondPersonName);
        System.out.println("Second Person Gender: " +secondPersonGender);
        System.out.println("Second Person Age: " +secondPersonAge);
        System.out.println("Second Person Car: " +secondPersonCar);
        System.out.println("Second Person Violations: " +secondPersonViolations);
        System.out.println("Second Person Credit: " +secondPersonCredit);
        System.out.println("Second Person Preliminary Rate: " +monthlyRate2);
        System.out.println("Second Person Final Rate (adjusted for age and gender): " +total2);
        System.out.println();
    }
}
