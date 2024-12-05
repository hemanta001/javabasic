package statickeyword;

public class StaticExample {
    static int count = 0;

    public StaticExample() {
        count++;
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
