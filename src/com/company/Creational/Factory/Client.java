package com.company.Creational.Factory;

public class Client {
    public static void main(String[] args) {
        LandLogistics landLogistics = new LandLogistics();
        Transport t = landLogistics.createTransport();
        t.doStuff();
    }
}
