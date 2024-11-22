package loops.dowhile;

public class DoWhile {

    public void performDoWhile() {
        int i = 1;
        do {
//            System.out.println("Number "+i);
            i++;
            System.out.println("Number " + i);
        } while (i <= 5);
    }

    public void performForOperation() {
        for (int i = 2; i <= 6; i++) {
            System.out.println("Number " + i);
        }
    }
}
