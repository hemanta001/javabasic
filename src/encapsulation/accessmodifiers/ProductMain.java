package encapsulation.accessmodifiers;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("John");
        System.out.println(product.getName());
    }
}
