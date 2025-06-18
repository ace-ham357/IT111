package package_person_input;

public class Person {
    //no main method

    String name;
    char gender;
    int age;
    double baselineRate = 300.00;
    String zipCode;
    int cityCode;
    boolean violations;

    boolean violationDUI;
    boolean violationRedLight;
    boolean violationSpeeding;

    double creditScore;

    public void display() {
        System.out.println("This is the information you have provided:");
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Gender: " +gender);
        System.out.println("ZIP: " +zipCode);
        System.out.println("Baseline Rate: " + baselineRate);
        System.out.println("(Don't forget that your rate may change.)");
        System.out.println("Violations: " + violations);
        System.out.println("DUI: " + violationDUI);
        System.out.println("Red Light: " + violationRedLight);
        System.out.println("Speeding Ticket: " + violationSpeeding);
        System.out.println("Credit Score: " + creditScore);
    }
    public double getRate(double monthlyRate) {
        if (violations == true || creditScore < 700) {
            monthlyRate = 300.00;
        } else {
            monthlyRate = 0.0;
        }
        return monthlyRate;

    }

    public double ageCategory(double adjustedRate){
        if(age <= 25 || age >=65){
            adjustedRate = 300.00;
        } else {
            adjustedRate = 0.00;
        }
        return adjustedRate;
    }

    public int identifyRegion(int states){
        String zip2;
        zip2 = zipCode.substring(0,2);
        cityCode = Integer.parseInt(zip2);

        if(cityCode >= 90 && cityCode <97){
            System.out.println("You entered " +zipCode+ " and you're from California.");
        } else if (cityCode == 97){
            System.out.println("You entered " +zipCode+ " and you're from Oregon.");
        } else if (cityCode >= 98 && cityCode <=99){
            System.out.println("You entered " +zipCode+ " and you're from Washington.");
        } else {
            System.out.println("Based on the zip code you entered, you are not in the Pacific Northwest. Please contact our National Office.");
        }
        return states;
    }

    public double caliRegion( double surcharge) {
        if (cityCode >= 90 && cityCode < 97) {
            surcharge = 200.00;
        } else {
            surcharge = 0.00;
        }
        return surcharge;
    }

}
