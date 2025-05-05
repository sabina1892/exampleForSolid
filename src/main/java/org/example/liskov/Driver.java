package org.example.liskov;

public class Driver implements DeliveryWorker{

    @Override
    public void work() {
        System.out.println("Deliver worker");
    }
}
