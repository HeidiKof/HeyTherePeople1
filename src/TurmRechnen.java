public class TurmRechnen {
    public static void main(String[] args) {

        long startValue = 282103;


        System.out.println(startValue);
        for (int i = 2; i <= 9; i++) {
            System.out.println(startValue + " * " + i);
            startValue = startValue * i;
        }
        for (int i = 2; i <= 9; i++) {
            System.out.println(startValue + " / " + i);
            startValue = startValue / i;
        }
        System.out.println(startValue);
    }
}
