package interfacexamples;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle motorbike = new MotorBike();
        motorbike.start();
        motorbike.stop();
    }
}
