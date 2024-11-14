package product;

public class Product {
    // class variables
    String name;
    float price;
    char grade;
    Long serialNumber;
    Double discount;

    public String getName() {
        return this.name;
    }

    //method or function with argument
    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public char getGrade() {
        return this.grade;
    }

    public Long getSerialNumber() {
        return this.serialNumber;
    }

    public Double getDiscount() {
        return this.discount;
    }
}
