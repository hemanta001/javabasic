package statickeyword.customlogger;

public class CustomLogger {
    public static final CustomLogger logger = new CustomLogger();

    public void log(String message) {
        System.out.println(message);
    }

    public void log(int value) {
        System.out.println(value);
    }

    public void log(double value) {
        System.out.println(value);
    }
}
