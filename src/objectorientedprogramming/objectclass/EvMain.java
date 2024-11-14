package objectorientedprogramming.objectclass;

public class EvMain {
    public static void main(String[] args) {

        ElectricVehicle electricVehicle = new ElectricVehicle();
        electricVehicle.brand = "Kia"; // value initialize
        electricVehicle.vin = 1234567; // value initialize
        electricVehicle.printBrand(); // method invoke or calling
        electricVehicle.printVin(); // method invoke or calling

        ElectricVehicle electricVehicleCopy1 = new ElectricVehicle();
        electricVehicleCopy1.brand = "Tesla"; // value initialize
        electricVehicleCopy1.vin = 8765432; // value initialize
        electricVehicleCopy1.brand = "Tesla2"; // value initialize
        electricVehicleCopy1.printBrand();
        electricVehicleCopy1.printVin();

        ElectricVehicle electricVehicleCopy2 = new ElectricVehicle();
        electricVehicleCopy2.brand = "Ford"; // value initialize
        electricVehicleCopy2.vin = 9876543; // value initialize
        electricVehicleCopy2.printBrand();
        electricVehicleCopy2.printVin();
    }
}
