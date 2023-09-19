package org.example;

public class Product {
    private int id;
    private String productName;
    private String productType;
    private int price;
    private int availability;

    public Product() {
    }

    public Product(int id, String productName, String productType, int price, int availability) {
        this.id = id;
        this.productName = productName;
        this.productType = productType;
        this.price = price;
        this.availability = availability;
    }

    public Product(String productName, String productType, int price, int availability) {
        this.productName = productName;
        this.productType = productType;
        this.price = price;
        this.availability = availability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(id: " + id + ", product name: " + productName + ", product type: " +
                                            productType + ", product price: " + price + ", product availability " +
                                            availability + ")";
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
}
