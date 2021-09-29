package com.company.Creational.Factory;

public class SeaLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
