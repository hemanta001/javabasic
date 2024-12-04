package polymorphismexamples;

public class Main {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        System.out.println(calculation.add(1));
        System.out.println(calculation.add(1, 2));
        System.out.println(calculation.add(1, 2, 3));
        System.out.println(calculation.add(1.2d, 2.2, 3.3d));
    }
}
