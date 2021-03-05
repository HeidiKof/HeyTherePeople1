import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {

        String demo = "I rolled a Natural 20.";

        System.out.println("demo.length = " + demo.length());
        System.out.println("demo.charAt = " + demo.charAt(0));
        System.out.println("demo.charAt = " + demo.charAt(7));
        System.out.println("demo.contains(\"Nat\") = " + demo.contains("Nat"));
        System.out.println("demo.contains(\"Crit\") = " + demo.contains("Crit"));
        System.out.println("demo.toLowerCase() = " + demo.toLowerCase(Locale.ROOT));
        System.out.println("demo.toUpperCase() = " + demo.toUpperCase(Locale.ROOT));
        System.out.println("demo.equals");

    }
}
