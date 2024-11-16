package objectorientedprogramming.constructor;

public class ElectricVehicle {
    String brand;
    Long vin;

    public ElectricVehicle() {
        System.out.println("I am constructor and I am called when object is created");
    }

    //parameterized constructor
    public ElectricVehicle(String brand, Long vin) {
        this.brand = brand;
        this.vin = vin;
        System.out.println("I am parameterized Constructor");
    }

    public void myMethod() {
        System.out.println("This is my method");
    }
}
