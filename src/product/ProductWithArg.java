package product;

public class ProductWithArg {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("TestName");
        product.setPrice(100.05f);
        System.out.println("The name of the product " + product.getName());
        System.out.println("The price of the product " + product.getPrice());
    }
}
