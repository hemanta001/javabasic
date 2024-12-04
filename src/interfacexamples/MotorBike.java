package interfacexamples;

public class MotorBike implements Vehicle{
    @Override
    public void start() {
        System.out.println("Motorbike starting...");
    }

    @Override
    public void stop() {
        System.out.println("Motorbike stopping...");
    }
}
