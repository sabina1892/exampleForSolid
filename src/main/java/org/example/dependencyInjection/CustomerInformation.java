package org.example.dependencyInjection;

public class CustomerInformation {
    private ProductInformation productInformation;

    public CustomerInformation(ProductInformation productInformation) {
        this.productInformation = productInformation;
    }
    public void displayInformation() {
        productInformation.situation();
    }
}
