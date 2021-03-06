public class TemperatureDemo {
    public static void main(String[] args) {
        double currentTemperatureCelsius = 32;

        double gradfahrenheit = CelsiusToFahrenheit(currentTemperatureCelsius);
        double gradcelsius = FahrenheitToCelsius(gradfahrenheit);

        System.out.println(currentTemperatureCelsius + " Grad Celsius sind " + gradfahrenheit + " Grad Fahrenheit.");
        System.out.println(gradfahrenheit + " Grad Fahrenheit sind " + gradcelsius + " Grad Celsius.");
    }
    public static double CelsiusToFahrenheit (double celsius) {
        double result = celsius * 9/5 + 32;
        return result;
    }
    public static double FahrenheitToCelsius (double fahrenheit) {
        double result = (fahrenheit - 32) * 5/9;
        return result;
    }
}
