package statickeyword;

public class Main {
    public static void main(String[] args) {
        System.out.println(StaticExample.count);
        new StaticExample();
        System.out.println(StaticExample.count);
        System.out.println(StaticExample.add(5,3));
    }
}
