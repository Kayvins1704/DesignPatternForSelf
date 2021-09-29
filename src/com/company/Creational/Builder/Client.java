package com.company.Creational.Builder;

public class Client {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder("White")
                .setCondiments("Condiments")
                .setFillings("Fillings")
                .build();

        System.out.println(burger.getFillings());
    }
}
