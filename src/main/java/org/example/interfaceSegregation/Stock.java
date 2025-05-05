package org.example.interfaceSegregation;

public class Stock implements Updatable,Deletable{
    @Override
    public void update() {
        System.out.println("Count of product is updatable");
    }

    @Override
    public void delete() {
        System.out.println("Product is deleted");
    }
}
