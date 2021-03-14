import java.util.Arrays;

public class SortDemoApp {
    public static void main(String[] args) {

        int[] arr = new int[7];

        arr[0] = 9;
        arr[1] = 8;
        arr[2] = 7;
        arr[3] = 6;
        arr[4] = 5;
        arr[5] = 4;
        arr[6] = 3;

        System.out.println();
        System.out.print(Arrays.toString(arr));
        System.out.println();


        arrangeOrder(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println();
        System.out.println(Arrays.toString(arr));

    }

    public static void arrangeOrder(int[] numbers) {

        System.out.println("length= " + numbers.length);

        boolean hasChanged = true;

        while (hasChanged == true) {
            hasChanged = false;

            for (int i = 0; i < numbers.length - 1; i++) {

                if (numbers[i] > numbers[i + 1]) {
                    hasChanged = true;
                    int tmp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = tmp;
                }
            }
        }

//        int tmp = numbers[1];
//        numbers [1] = numbers [0];
//        numbers [0] = tmp;


    }

}
