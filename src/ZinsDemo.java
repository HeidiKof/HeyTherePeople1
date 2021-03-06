public class ZinsDemo {
    public static void main(String[] args) {

        double kontostand = 1000;
        double zinssatz = 2.25;
        int tage =120;
        double zinsen = Zinsberechnung(kontostand, zinssatz, tage);

        //zinsen = (kontostand * zinssatz * tage) / (100 * 360);

        double kontostand2 = 500;
        double zinssatz2 = 3;
        int tage2 =234;
        double zinsen2 = Zinsberechnung(kontostand2, zinssatz2, tage2);

        System.out.println("Die erhaltenen Zinsen betragen " + zinsen + " €.");
        System.out.println("Die erhaltenen Zinsen betragen " + zinsen2 + " €.");

    }
    public static double Zinsberechnung (double kapital, double zinszahl, int zeitInTagen) {
        double result = (kapital * zinszahl * zeitInTagen) / (100 * 360);
        return result;
    }
}
