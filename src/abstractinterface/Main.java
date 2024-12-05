package abstractinterface;

public class Main {
    public static void main(String[] args) {
        //line by line execution (synchronous execution)
        AbstractSorter abstractSorter = new SorterUtility();
        abstractSorter.askNumbers();
        abstractSorter.sortNumbers();
        abstractSorter.printNumbers();
    }
}
