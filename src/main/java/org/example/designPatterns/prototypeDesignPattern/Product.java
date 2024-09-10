package org.example.designPatterns.prototypeDesignPattern;

public class Product extends ProductPrototype {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(Product product) {
        this.name = product.name;
        this.price = product.price;
    }

    @Override
    public ProductPrototype clone() {
        return new Product(this);
    }

    @Override
    public void display() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}
