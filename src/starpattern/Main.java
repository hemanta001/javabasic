package starpattern;

public class Main {
    public static void main(String[] args) {
        StarPattern starPattern = new StarPattern();
        System.out.println("-------RT ANGLED TRIANGLE");
        starPattern.printRightAngledPattern();
        System.out.println("INVERTED RT ANGLED TRIANGLE");
        starPattern.printInvertedRightAngledTriangle();
    }
}
