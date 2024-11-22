package controlstatements.ifelseifstatement;

import java.util.Scanner;

public class HighestNumber {
    int firstNumber;
    int secondNumber;
    int thirdNumber;

    public HighestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Number");
        this.firstNumber = scanner.nextInt();
        System.out.println("Enter the Second Number");
        this.secondNumber = scanner.nextInt();
        System.out.println("Enter the Third Number");
        this.thirdNumber = scanner.nextInt();
    }

    public void printHighest() {
        if (this.firstNumber > this.secondNumber && this.firstNumber > this.thirdNumber) {
            System.out.println("The highest number is " + this.firstNumber);
        }
        else if (this.secondNumber > this.firstNumber && this.secondNumber > this.thirdNumber) {
            System.out.println("The highest number is " + this.secondNumber);
        }
        else {
            System.out.println("The highest number is " + this.thirdNumber);
        }
    }
}
