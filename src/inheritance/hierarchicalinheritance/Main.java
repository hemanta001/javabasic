package inheritance.hierarchicalinheritance;

public class Main {
    public static void main(String[] args) {
//        Circle circleShapeWOI = new Circle();
//        Rectangle rectWOI = new Rectangle();
        //type   objectVariable        initialization (object)
        Circle circleShape = new Circle();
        Shape rectangleShape = new Rectangle();
        circleShape.draw();
        circleShape.area();
        rectangleShape.draw();
    }
}
