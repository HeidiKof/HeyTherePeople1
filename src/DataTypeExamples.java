public class DataTypeExamples {
    public static void main(String[] args) {
        System.out.println("Einige Beispiele zu Datentypen");

        int laenge;
        int breite;
        int ergebnis;

        laenge = 5;
        breite = 7;

        ergebnis = laenge * breite;

        System.out.println("Die Fläche von " + laenge + " und " + breite + " misst: " + ergebnis + "cm^2");

        int a, b, c;


        a = 4;
        b = 5;
        c = a + b;

        System.out.println("a + b = " + a + " + " + b + " = " + c);

        c = a - b;

        System.out.println("a - b = " + a + " - " + b + " = " + c);

        c = a * b;

        System.out.println("a * b = " + a + " * " + b + " = " + c);

        c = a / b;

        System.out.println("a / b = " + a + " / " + b + " = " + c);

        c = a % b;

        System.out.println("a % b = " + a + " % " + b + " = " + c);


    }
}
