package primenumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        PrimeNumberCheck primeNumberCheck = new PrimeNumberCheck();
        primeNumberCheck.isPrimeNumber(number);
    }
}
