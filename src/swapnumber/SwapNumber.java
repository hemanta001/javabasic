package swapnumber;

import java.util.Scanner;

public class SwapNumber {

    public void processSwapping() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second Number");
        int secondNumber = scanner.nextInt();
        System.out.println("Before swapping: First Number = " + firstNumber + ", Second Number = " + secondNumber);

        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("After swapping: First Number = " + firstNumber + ", Second Number = " + secondNumber);
    }
}
