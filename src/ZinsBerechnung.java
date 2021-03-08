public class ZinsBerechnung {
    public static void main(String[] args) {
        double startKapital = 1000;
        double rate = 1.5;
        int jahre = 10;


//        System.out.println(zinsen);

        System.out.println(startKapital);
        for (int i = 1; i <= jahre; i++) {
            double zinsen = Zinsberechnung(startKapital, rate);
            System.out.println(startKapital + " nach " + i + " Jahr(en).");
            startKapital = startKapital + zinsen;
        }
    }

    public static double Zinsberechnung (double kapital, double zinszahl) {
        double result = (kapital * zinszahl) / (100);
        return result;
    }
}