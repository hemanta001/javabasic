package greaternumber;


import java.util.Scanner;

public class GreaterNumberWithUserInput {

    public static void main(String[] args) {
        Scanner scannerVariable = new Scanner(System.in);// variable declaration or initialization

        System.out.print("Enter first number: ");

        int firstNumber = scannerVariable.nextInt();

        System.out.print("Enter second number: ");

        int secondNumber = scannerVariable.nextInt();

        if (firstNumber < secondNumber) {
            System.out.println("The greater number is " + secondNumber);
        } else {
            System.out.println("The greater number is " + firstNumber);
        }
    }
}
