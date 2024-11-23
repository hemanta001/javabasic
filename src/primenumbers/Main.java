package primenumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        PrimeNumberCheck primeNumberCheck = new PrimeNumberCheck();
        primeNumberCheck.isPrimeNumber(number);

        boolean isPrimeNumber = primeNumberCheck.isPrime(number);
        if (isPrimeNumber) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        primeNumberCheck.checkPrimeWithDivisionCount(number);
    }
}
