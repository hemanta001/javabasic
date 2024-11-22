package loops.continueexample;

public class ContinueExample {
    public void performContinue() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Number: " + i);
        }
    }
}
