package inheritance.multilevelinheritance;

public class Mammal extends Animal{

    @Override
    public void sound() {
        System.out.println("Mammals make specific sounds.");
    }

    public void movement() {
        System.out.println("Mammals can make movements");
    }
}
