package abstractionexamples;

public class Dog extends Animal{

    //method implementation
    @Override
    void makeSound() {
        System.out.println("Creating Sound");
    }

    @Override
    void sleep() {
        System.out.println("Sleeping in Child Class");
    }
}
