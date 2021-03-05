public class DistanceDemo {

    public static void main(String[] args) {

        int kilometerValue = 4;


        double miles = kilometerToMiles(kilometerValue);
        double kilometers = milesToKilometers(miles);


        System.out.println(kilometerValue + " Kilometer sind " + miles + " Meilen");
        System.out.println(miles + " Meilen sind " + kilometers + " Kilometer");
    }

    public static double kilometerToMiles (int kilometer) {
        double result = kilometer / 1.609;
        return result;
    }

    public static double milesToKilometers (double meilen) {
        double result = meilen * 1.609;
        return result;
    }
}
