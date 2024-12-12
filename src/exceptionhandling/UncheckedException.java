package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    private int number1 = 10;
    private int number2 = 0;

    public void askNumber1() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number: ");
            number1 = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter valid first number.");
            askNumber1();
        }
    }

    public void askNumber2() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter second number: ");
            number2 = scanner.nextInt();
//            if (number2 == 0) {
//                System.out.println("Second Number can not be zero");
//                askNumber2();
//            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid second number. ");
            askNumber2();
        } catch (Exception e) {
            System.out.println("Error occured ");
        }
    }

    public void divideNumber() {
        try {
            int result = number1 / number2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Division by zero errorzzzzzz");
        } catch (Exception e) {
            System.out.println("Error Occured");
        } finally {
            System.out.println("Inside finally block");
        }
    }

    //buggy
    public void stackOverFlowExample() {
        stackOverFlowExample();
    }

    public void getFile(){
        //reading file
        try{
            File file = new File("nonexistence.txt");
            Scanner scanner = new Scanner(file);
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        }
        finally {
            System.out.println("Finally Block");
        }
    }
}
