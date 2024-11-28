package inheritance.hierarchicalinheritance;

public class Circle extends Shape{

    @Override
    public void draw(){
        System.out.println("Drawing a Circle");
    }

    public void area(){
        System.out.println("Area of Circle: " + (Math.PI * Math.pow(2, 2)));
    }
}
