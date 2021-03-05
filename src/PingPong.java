public class PingPong {
    public static void main(String[] args) {

        int counter = 1;

        while (counter <= 100) {

            if (counter % 2 == 1) {
                System.out.println(counter + ": Ping");
            } else {
                System.out.println(counter + ": Pong");

            }
            counter++;
        }
        int counter2 = 1;
        while (counter2 <=500) {

            if (counter2 % 3 == 0 || counter2 % 5 == 0 || counter2 % 7 == 0) {
                System.out.println(counter2);
            }
            counter2++;


        }

    }
}