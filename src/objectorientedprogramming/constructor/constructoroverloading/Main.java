package objectorientedprogramming.constructor.constructoroverloading;

public class Main {
    public static void main(String[] args) {
        //Using default Constructor
        Employee emp1 = new Employee();
        emp1.displayDetails();
        System.out.println();
        //Using constructor with ID
        Employee emp2 = new Employee(101);
        emp2.displayDetails();
        System.out.println();
        //Using constructor with ID and name
        Employee emp3 = new Employee(102, "John Doe");
        emp3.displayDetails();
        //Using constructor with name and department
        Employee emp4 = new Employee("John Doe", "IT");
        emp4.displayDetails();
        //Using constructor with all fields/arguments/parameters
        Employee emp5 = new Employee(1, "John Doe", "IT");
        emp5.displayDetails();

    }

}
