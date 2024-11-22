package loops.breakloop;

public class BreakLoopExample {

    public void performBreakLoop() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("Number " + i);
        }
    }
}
