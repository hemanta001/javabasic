package objectorientedprogramming.constructor;

public class Main {

    public static void main(String[] args) {
        //object initialization
        ElectricVehicle electricVehicle = new ElectricVehicle();

        electricVehicle.myMethod();

        ElectricVehicle electricVehicleParameterized = new ElectricVehicle("Tesla",123456L);
        System.out.println(electricVehicleParameterized.vin);
        System.out.println(electricVehicleParameterized.brand);
    }
}
