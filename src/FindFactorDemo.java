public class FindFactorDemo {
    public static void main(String[] args) {

       findFactors(35);
       findFactors(57);
       findFactors(22);




    }

    public static void findFactors (int number) {

        System.out.println("\nFaktoren von " + number + ": ");

        int counter = 1;
        while (counter <= number) {
           // if (number == counter) {
           //     System.out.print(counter);
           // }
            if (number % counter == 0) {
                System.out.print(counter + ", ");
            }
            //System.out.println("");
            counter++;

        }
    }


}
