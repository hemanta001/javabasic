package loops.forloop;

public class ForLoopExample {

    public void printNumbers() {
        for (int i = 0; i < 10; i++) {

            System.out.println(i);

        }
    }

    public void printNumbersWithDecrement() {
        for (int i = 9; i >= 0; i--) {

            System.out.println(i);

        }
    }

    public void printTable() {
        int number = 5;

        for (int i = 1; i <= 20; i++) {
            System.out.println((number + " * " + i + " = ") + (number * i));

        }
    }
}
