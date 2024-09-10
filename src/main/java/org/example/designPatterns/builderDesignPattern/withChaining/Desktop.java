package org.example.designPatterns.builderDesignPattern.withChaining;

public class Desktop {
    private String motherBoard;
    private String processor;
    private String memory;
    private String storage;
    private String graphicsCard;
    public void display() {
        System.out.println("MotherBoard: " + motherBoard);
        System.out.println("Processor: " + processor);
        System.out.println("Memory: " + memory);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics Card: " + graphicsCard);
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public void setMemory(String memory) {
        this.memory = memory;
    }
    public void setStorage(String storage) {
        this.storage = storage;
    }
    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
}
