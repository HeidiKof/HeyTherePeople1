public class Ziffernsumme {
    public static void main(String[] args) {

        System.out.println("calcDigitSum (356787) =" + calcDigitSum(356787));
        System.out.println("calcDigitSum (444567189) =" + calcDigitSum(444567189));
        System.out.println("calcDigitSum (23) =" + calcDigitSum(23));
        System.out.println("calcDigitSum (1234567890) =" + calcDigitSum(1234567890));
    }
        public static int calcDigitSum (int value) {

            int ziffernsumme = 0;

            while (value > 0) {
                ziffernsumme = ziffernsumme + (value % 10);
                value = value /10;}

            return ziffernsumme;
        }
    }

