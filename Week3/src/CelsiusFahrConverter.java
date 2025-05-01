public class CelsiusFahrConverter {
    public static void main(String[] args){
        // far = (cel * 9/5) + 32

        int cel, fahr;
        for(cel = 0; cel <= 100; cel = cel+2){
            fahr = (cel * 9/5) + 32;
            System.out.println(cel+ " degrees Celsius is equal to " +fahr+ " degrees Fahrenheit");
        }
        System.out.println("All done!");
    }
}
