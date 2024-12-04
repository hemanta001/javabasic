package encapsulation.accessmodifiers;

import encapsulation.accessmodifiers.protectedexample.ProtectedExample;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("John");
        product.setPrice(10);
        product.setGrade('A');
        product.setSerialNumber(1234L);
        product.setDiscount(20d);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getGrade());
        System.out.println(product.getSerialNumber());
        System.out.println(product.getDiscount());
    }
}
