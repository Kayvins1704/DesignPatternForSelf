package com.company.Creational.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        ModernFurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        Chair chair = modernFurnitureFactory.createChair();
        chair.message();
    }
}
