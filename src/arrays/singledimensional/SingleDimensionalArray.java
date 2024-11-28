package arrays.singledimensional;

import java.util.Scanner;

public class SingleDimensionalArray {

    public void explainArray() {
        int[] numbers = {10, 20, 30, 40, 50}; //size: 5
//        float[] floatNumbers = {1.2f, 1.5f};
//        long[] longNumbers = {10, 20, 30, 40, 50};
//        String[] bankNames = {"ABC Bank", "Prabhu Bank", "Citi Bank"};
//        int number = 10;

        //Iterating through the array using a for loop
        System.out.println("Accessed Element: " + numbers[4]);
        System.out.println("Array Size: " + numbers.length);
        System.out.println("Array Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Elements at index " + i + ": " + numbers[i]);
        }
    }

    public void findMaxMinValue() {
        int[] numbers = {10, 1, 40, 20, 50, 80, 3, 45, -1, 5, 9, -6};
        int min = numbers[5];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Minimum Number is " + min);
        System.out.println("Maximum Number is " + max);
    }

    public void findSumAndAverage() {
        int[] numbers = {10, 1, 40, 20, 50, 80, 3, 45, 2, 5, 9, 60};
        float sum = 0;
        for (int i = 0; i < numbers.length; i++) {
//            sum = sum + numbers[i];
            sum += numbers[i];
        }
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + (sum / numbers.length));
    }

    public void reverseArray() {
        int[] numbers = {10, 20, 30, 40};

        System.out.println("------Before Reverse Order--------------------------------");
        System.out.println("numbers[0]: " + numbers[0]);
        System.out.println("numbers[1]: " + numbers[1]);
        System.out.println("numbers[2]: " + numbers[2]);
        System.out.println("numbers[3]: " + numbers[3]);

        for (int left = 0, right = numbers.length - 1; left < right; left++, right--) {
            int temp = numbers[right];
            numbers[right] = numbers[left];
            numbers[left] = temp;
        }

        System.out.println("------After Reverse Order--------------------------------");
        System.out.println("numbers[0]: " + numbers[0]);
        System.out.println("numbers[1]: " + numbers[1]);
        System.out.println("numbers[2]: " + numbers[2]);
        System.out.println("numbers[3]: " + numbers[3]);
    }

    public void searchElementInArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
      //type  variable     object
        System.out.println("Enter " + size + " elements");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Enter the number to search: ");
        int searchElement = scanner.nextInt();

        Integer searchedIndex = null;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchElement) {
                searchedIndex = i;
                break;
            }
        }
        if (null != searchedIndex) {
            System.out.println("The found index is " + searchedIndex);
        } else {
            System.out.println("Element is not found at any index");
        }
    }
}
