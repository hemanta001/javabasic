package objectorientedprogramming.constructor.constructoroverloading;

public class Employee {
    Integer id;
    String name;
    String department;

    //Default constructor
    public Employee() {
        this.id = 0;
        this.name = "UnKnown Employee";
        this.department = "Not Assigned";
    }

    //Constructor overloaded with only ID
    public Employee(Integer id) {
        this.id = id;
        this.name = "UnKnown Employee";
        this.department = "Not Assigned";
    }

    //Constructor overloaded with only ID and Name
    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.department = "Not Assigned";
    }

    //Constructor overloaded with only department and Name
    public Employee(String name, String department) {
        this.id = 0;
        this.name = name;
        this.department = department;
    }

    //Constructor overloaded with all parameters
    public Employee(Integer id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

}
