package exceptionhandling;

public class Main {
    public static void main(String[] args) {
        UncheckedException uncheckedException = new UncheckedException();
//        uncheckedException.askNumber1();
//        uncheckedException.askNumber2();
//        uncheckedException.divideNumber();
        try{
            uncheckedException.stackOverFlowExample();
        }
        catch (StackOverflowError e){
            System.out.println("Stack Over Flow error");
        }
    }
}
