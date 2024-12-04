package polymorphismexamples;

public class Calculation {

    public int add(int value) {
        return value + 1;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public double add(double a, double b, int c) {
        return a + b + c;
    }

    public double add(int a, double b, int c) {
        return a + b + c;
    }

    public double add(double a, int b, double c) {
        return a + b + c;
    }
}
