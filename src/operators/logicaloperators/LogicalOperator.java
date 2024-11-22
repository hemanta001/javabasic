package operators.logicaloperators;

public class LogicalOperator {

    public void performLogicalOperations() {
//        boolean x=true;
//        boolean y = false;

        boolean a = false , b = true;
        System.out.println("AND: " + (a && b));
        System.out.println("OR: "+ (a || b));
        System.out.println("NOT: " + (!b));

    }
}
