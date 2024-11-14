package product;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product();

        product.name = "TestProduct";
        product.grade = 'C';

        System.out.println("The product Name is " + product.getName());
        System.out.println("The product Grade is " + product.getGrade());
    }
}
