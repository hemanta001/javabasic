package inheritance.singleinheritance;

public class Employee {
    String name;
    double salary;

    public Employee(){

    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
