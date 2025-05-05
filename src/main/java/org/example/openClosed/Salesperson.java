package org.example.openClosed;

public class Salesperson implements Employee {
   private String name;
    @Override
    public void jobDescription() {
        System.out.println("A salesperson is someone who assists customers and persuades them to buy products or services.");
    }
}
