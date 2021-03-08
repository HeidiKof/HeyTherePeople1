public class findPrimeNumbers {
    public static void main(String[] args) {
        System.out.println("isPrime (31) = " + isPrime(31));
        System.out.println("isPrime (42) = " + isPrime(42));
        System.out.println("isPrime (99961) = " + isPrime(99961));
        System.out.println("isPrime (3561) = " + isPrime(3561));
        System.out.println("isPrime (77847) = " + isPrime(77847));
        System.out.println("isPrime (500) = " + isPrime(500));

    int checkNumbers = 2;
    while (checkNumbers <= 1234) {
        if (isPrime(checkNumbers)) {
            System.out.println(checkNumbers + ", ");

        }
        checkNumbers++;
    }
    }

    public static boolean isPrime(int number) {

        for (int checkValue = 2; checkValue < number / 2; checkValue++) {
            if (number % checkValue == 0) {
                return false;
            }


            //       int checkValue = 2;
            //     boolean checkIsPrime = true;
            //   while (checkValue < number/2)
            //     if (number % checkValue == 0) {
            //     checkIsPrime = false;
            //   break;
            // }
            // checkValue++;
            //  }

           //  return checkIsPrime;
        }
        return true;
    }
}

