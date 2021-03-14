import java.util.Random;

public class LottoZahlen {
    public static void main(String[] args) {

        System.out.println("Unser Quicktipp");
        for (int tipps = 0; tipps < 6; tipps++) {
            System.out.print("Nr. " + tipps + ": ");
            int[] arr = createOneTipp();


            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.println();
        }



    }
        public static int[] createOneTipp () {

            int[] oneTipp = new int[6];

            for (int i = 0; i < 6; i++) {
               oneTipp[i] = generateOneNumber(45);
            }
            return oneTipp;
        }



    public static int generateOneNumber(int maxNumber) {
        Random random = new Random();
        int randValue = random.nextInt();
        if (randValue < 0) {
            randValue = randValue * -1;
        }
        int value = (randValue % maxNumber) +1;

    return value;
    }
}
