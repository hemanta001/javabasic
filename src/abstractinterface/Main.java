package abstractinterface;

public class Main {
    public static void main(String[] args) {
        AbstractSorter abstractSorter = new SorterUtility();
        abstractSorter.askNumbers();
        abstractSorter.sortNumbers();
        abstractSorter.printNumbers();
    }
}
