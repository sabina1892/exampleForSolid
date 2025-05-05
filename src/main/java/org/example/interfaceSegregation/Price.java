package org.example.interfaceSegregation;

public class Price implements Updatable{
    @Override
    public void update() {
        System.out.println("Price is updated");
    }
}
