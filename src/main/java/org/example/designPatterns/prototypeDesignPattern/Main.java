package org.example.designPatterns.prototypeDesignPattern;

public class Main {
    public static void main(String[] args) {
        ProductPrototype product1 = new Product("Laptop", 1000);
        ProductPrototype  product2 = new Product("Desktop", 2000);

        ProductPrototype newProduct1 = product1.clone();
        ProductPrototype newProduct2 = product2.clone();

    }
}
