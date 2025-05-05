package org.example.dependencyInjection;

public class ProductDelivering implements ProductInformation{
    @Override
    public void situation() {
        System.out.println("It was done successfully");
    }
}
