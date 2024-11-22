package loops.whileloop;

public class WhileLoopExample {

    public void performWhileLoop() {
        int i = 1;
        System.out.println("condition "+(i<=5));
        while(i<=5){
            System.out.println("Number "+i);
            i++;
        }
    }
}
