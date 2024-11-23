package primenumbers;

public class PrimeNumberCheck {

    public void isPrimeNumber(int number) {
        boolean isPrime = number > 1;
        System.out.println("check number > 1");
        System.out.println(number > 1);
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }

    public boolean isPrime(int number) {
        boolean isPrime = number > 1;
        System.out.println("check number > 1");
        System.out.println(number > 1);
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public void checkPrimeWithDivisionCount(int number) {
        int divisionCount = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisionCount = divisionCount + 1;
            }
            if (divisionCount > 2) {
               break;
            }
        }
        if (divisionCount == 2) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }
}
