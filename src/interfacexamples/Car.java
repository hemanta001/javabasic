package interfacexamples;

public class Car implements Vehicle{
    //implementation
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    //implementation
    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }
}
